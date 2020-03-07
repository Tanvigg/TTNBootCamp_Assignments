package com.example.question3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogFragmentActivity extends AppCompatActivity {
    private Button mOpenButton;
    public TextView mInputDisplay;
    public String mInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        mOpenButton = findViewById(R.id.click);
        mInputDisplay= findViewById(R.id.input_text);

        mOpenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Opening Dialog...");
                MyCustomDialog myCustomDialog = new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(),"MyCustomDialog");


            }
        });

    }
}
