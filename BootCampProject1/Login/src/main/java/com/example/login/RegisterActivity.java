package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RegisterActivity extends AppCompatActivity {
    private TextInputLayout username, email, phone, password, confirm_password;
    private Button register_button;
    private TextView btn_login;
    private String user_name, user_email, user_phn, user_pass, user_confirm_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirm_password);
        register_button = findViewById(R.id.register_button);
        btn_login = findViewById(R.id.btn_login);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser(v);
            }


        });


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validateUserName() {
        String val = username.getEditText().getText().toString();
        String noWhiteSpaces ="^[^\\d\\s]+$";
        if (val.isEmpty()) {
            username.setError("Field cannot be empty");
            return false;

        } else if (val.length() >= 15) {
            username.setError("Username too long");
            return false;
        } else if (!val.matches(noWhiteSpaces)) {
            username.setError("WhiteSpaces are not allowed");
            return false;

        } else {
            username.setError(null);
            username.setErrorEnabled(false);
            return true;
        }

    }

    private boolean validateEmail() {
        String val = email.getEditText().getText().toString();
        String emailPattern = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
        if (val.isEmpty()) {
            email.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            email.setError("Invalid Email Address");
            return false;
        } else {
            email.setError(null);
            email.setErrorEnabled(false);
            return true;

        }


    }

    private boolean validatePhone(){
        String val = phone.getEditText().getText().toString();
        if(val.isEmpty()){
            phone.setError("Field cannot be empty");
            return false;
        }else{
            phone.setError(null);
            phone.setErrorEnabled(false);
            return true;
        }

    }

    private boolean validatePassword(){
        String val = password.getEditText().getText().toString();
        String passwordVal ="^(?=.*\\d).{4,8}$"; // Password must be between 4 and 8 digits long and include at least one numeric digit.

        if(val.isEmpty()){
            password.setError("Field cannot be empty");
            return false;


        }
        else if(!val.matches(passwordVal)){
            password.setError("Invalid Password");
            return false;
        }
        else{
            password.setError(null);
            password.setErrorEnabled(false);
            return true;
        }

    }

    private boolean validateConfirmedPassword(){
        String val = confirm_password.getEditText().getText().toString();
        if(val.isEmpty()){
            confirm_password.setError("Field cannot be empty");
            return false;
        }

        else{
            confirm_password.setError(null);
            confirm_password.setErrorEnabled(false);
            return true;
        }
    }

    private void registerUser(View v) {
        if (!validateUserName() | !validateEmail() | !validatePhone() | !validatePassword() |!validateConfirmedPassword())
            return;

        //getting all the values in string
        user_name = username.getEditText().getText().toString();
        user_email = email.getEditText().getText().toString();
        user_phn = phone.getEditText().getText().toString();
        user_pass = password.getEditText().getText().toString();
        user_confirm_pass = confirm_password.getEditText().getText().toString();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(user_name);
        arrayList.add(user_email);
        arrayList.add(user_phn);
        arrayList.add(user_pass);
        Intent intent = new Intent(RegisterActivity.this,DetailsActivity.class);

        intent.putStringArrayListExtra("list",arrayList);
        startActivity(intent);

    }
}
