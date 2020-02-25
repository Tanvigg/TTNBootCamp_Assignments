package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private Button login_button;
    private EditText login_emailEditText,login_passwordEditText;
    private String email,passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        initializeFileds();


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();

            }




        });


    }


    private void initializeFileds() {
        login_button =  findViewById(R.id.login_button);
        login_emailEditText = findViewById(R.id.login_email);
        login_passwordEditText = findViewById(R.id.login_password);
    }

    public boolean validateEmail(){
        String val = login_emailEditText.getText().toString();
        if(val.isEmpty()){
            login_emailEditText.setError("Enter Email..");
            login_emailEditText.requestFocus();
            return false;
        }
        else{
            login_emailEditText.setError(null);
            return true;

        }

    }

    public boolean validatePassword(){
        String val = login_passwordEditText.getText().toString();
        if(val.isEmpty()){
            login_passwordEditText.setError("Enter Password..");
            login_passwordEditText.requestFocus();
            return false;
        }
        else{
            login_passwordEditText.setError(null);
            return true;

        }

    }

    private void loginUser() {
        if(!validateEmail() | !validatePassword()){
            return;
        }
        email  = login_emailEditText.getText().toString();
        passwd = login_passwordEditText.getText().toString();

        if(passwd.length()>0){
            login_passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.eye,0);
        }





    }
}
