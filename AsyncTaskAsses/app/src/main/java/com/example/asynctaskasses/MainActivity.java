package com.example.asynctaskasses;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.EmbossMaskFilter;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    private Button btnShowProgress,btnShowProgress1;

    private ImageView imageView;
    private String image_url = "https://image.freepik.com/free-photo/image-human-brain_99433-298.jpg";
    private ProgressDialog progressDialog;
    private TextView progressText;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowProgress = findViewById(R.id.btnProgressbar);
        btnShowProgress1 = findViewById(R.id.btnProgressbar1);
        imageView = findViewById(R.id.image);
        progressBar = findViewById(R.id.progress_bar);
        progressText = findViewById(R.id.textView);
        progressBar.setAlpha(0);
        progressText.setAlpha(0);

        btnShowProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConnected()) {

                    progressBar.setAlpha(1);
                    progressText.setAlpha(1);
                    Download_task download_task = new Download_task();
                    download_task.execute(image_url);

                } else {
                    Toast.makeText(MainActivity.this, "Unable to connect to network", Toast.LENGTH_SHORT).show();

                }


            }
        });

        btnShowProgress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                

            }
        });
    }

    private boolean isConnected() {
        Context context = getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Service.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {

                    return true;

                }

            }


        }
        return false;


    }

    private class Download_task extends AsyncTask<String, Integer, String> {


        @Override
        protected void onPreExecute() {
            progressBar.setIndeterminate(false);
            progressBar.setMax(100);
           /* progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setTitle("Download in Progress...");
            progressDialog.setMessage("Downloading...");
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(ProgressBar.SCROLL_AXIS_HORIZONTAL);
            progressDialog.setMax(100);
            progressDialog.setProgress(0);
            progressDialog.show();*/


        }

        @Override
        protected String doInBackground(String... params) {
            String path = params[0];
            int file_length;
            URLConnection urlConnection;

            Log.i("Info:Path", path);

            try {
                URL url = new URL(path);
                urlConnection= url.openConnection();
                urlConnection.connect();
                file_length = urlConnection.getContentLength();

                Log.i("Info:Path", Integer.toString(file_length));
                File new_folder = new File(Environment.getExternalStorageDirectory() + "/myFolder");
                Log.i("Info:Path", new_folder.toString());
                if (!new_folder.exists()) {
                    if (new_folder.mkdir()) {

                        Log.i("Info", "Folder Successfully Created..");

                    } else {
                        Log.i("Info", "Failed to create folder..");

                    }
                } else {
                    Log.i("Info", "Folder already exists");
                }


                File output_file = new File(new_folder, "downloaded_image.jpg");
                OutputStream outputStream = new FileOutputStream(output_file);


                InputStream inputStream = new BufferedInputStream(url.openStream(), 8192);
                byte[] data = new byte[1024];
                int total = 0;
                int count;
                while ((count = inputStream.read(data)) != -1) {
                    Log.i("Info:Path","Downloading...");
                    while (!isConnected()){
                        Thread.sleep(1);
                    //Toast.makeText(MainActivity.this,"Paused...",Toast.LENGTH_SHORT).show();
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {

                                // Stuff that updates the UI
                                progressText.setText("Paused..");

                            }
                        });


                    }
                    total += count;
                    Thread.sleep(50);
                    int progress = 100 * total / file_length;
                    publishProgress(progress);
                    outputStream.write(data, 0, count);
                    Log.i("Info", "Progress:" + Integer.toString(progress));


                }
                outputStream.flush();
                inputStream.close();
                outputStream.close();

                Log.i("Info", "Progress:" + Integer.toString(file_length));


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Download Complete...";
        }

     /*   public void setError(){
            progressText.setText("Paused");
        }*/


        @Override
        protected void onProgressUpdate(Integer... values) {

            progressBar.setProgress(values[0]);
            progressText.setText(values[0] + "/" + progressBar.getMax());

        }

        @Override
        protected void onPostExecute(String result) {
            //progressDialog.hide();
            File folder = new File(Environment.getExternalStorageDirectory() + "/myFolder");
            File output_file = new File(folder, "downloaded_image.jpg");

            String path = output_file.toString();
            Log.d("img_path", path);
            imageView.setImageDrawable(Drawable.createFromPath(path));
            Log.i("Info", "Path:" + path);
            progressBar.setAlpha(0);
            progressText.setAlpha(0);
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();



        }
    }
}
