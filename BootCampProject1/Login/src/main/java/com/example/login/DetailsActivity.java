package com.example.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.net.URI;
import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private TextView user_text;
    private TextView user_email;
    private TextView user_phn;
    private TextView user_pass;

    private EditText url;
    private Button open_url;
    private Button cam_permission;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    private static final int Camera_Request = 101;
    String urlText="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initializeFields();

    }

    private void initializeFields() {
        user_text = findViewById(R.id.username_text);
        user_email = findViewById(R.id.email_text);
        user_phn = findViewById(R.id.Phone_text);
        user_pass = findViewById(R.id.password_text);
        url = findViewById(R.id.url);
        open_url = findViewById(R.id.open_url);
        cam_permission = findViewById(R.id.cam_permission);


        ArrayList<String> list1 = getIntent().getStringArrayListExtra("list");
        user_text.setText(list1.get(0));
        user_email.setText(list1.get(1));
        user_phn.setText(list1.get(2));
        user_pass.setText(list1.get(3));


        open_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urlText = url.getText().toString();
                if(TextUtils.isEmpty(urlText)){
                    url.setError("Type a Url First");
                }
                else {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(urlText));
                    startActivity(i);
                }


            }
        });

        cam_permission.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                takePhotoFromCamera();
            }
        });



    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void takePhotoFromCamera() {
        if(checkSelfPermission(Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CAMERA},MY_CAMERA_PERMISSION_CODE);
        }
        else{
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent,Camera_Request);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Camera Permission Granted", Toast.LENGTH_LONG).show();
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, Camera_Request);
            } else {
                Toast.makeText(this, "Camera Permission denied", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
