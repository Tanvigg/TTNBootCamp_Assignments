package com.example.storageassess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button submit,retrieve;
    private SharedPreferences sharedPreferences;
    private static final String DEFAULT="N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edText);
        textView = findViewById(R.id.textView);
        submit = findViewById(R.id.submit);
        retrieve = findViewById(R.id.Retrieve);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();

            }
        });

        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("mySharedPreference",MODE_PRIVATE);
                String text = sharedPreferences.getString("text",DEFAULT);
                if(text.equals(DEFAULT)){
                    Toast.makeText(MainActivity.this,"No Data Found",Toast.LENGTH_LONG).show();

                }
                else{
                    textView.setText(text);


                }


            }
        });
    }

    private void saveData() {
        String text = editText.getText().toString();
        sharedPreferences = this.getSharedPreferences("mySharedPreference",MODE_PRIVATE);
        Log.d("text",text);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("text",text);
        editor.commit();
        Toast.makeText(getApplicationContext(),"data saved successfully...",Toast.LENGTH_LONG).show();
    }
}
