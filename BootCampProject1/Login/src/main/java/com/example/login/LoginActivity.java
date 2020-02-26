package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private Button login_button;
    private EditText login_emailEditText,login_passwordEditText;
    private String email,passwd;
    private AppCompatCheckBox checkBox;
    private TextView btn_register;
    private ImageView logo_image;
    private TextView logo_text;


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
        logo_image = findViewById(R.id.login_image);
        logo_text = findViewById(R.id.login_text);
        login_emailEditText = findViewById(R.id.login_email);
        login_passwordEditText = findViewById(R.id.login_password);
        login_button =  findViewById(R.id.login_button);

        btn_register = findViewById(R.id.btn_register);



        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);

                Pair[] pairs = new Pair[6];
                pairs[0] = new Pair<View,String>(logo_image,"logo_image");
                pairs[1] = new Pair<View,String>(logo_text,"logo_text");
                pairs[2] = new Pair<View,String>(login_emailEditText,"email_trans");
                pairs[3] = new Pair<View,String>(login_passwordEditText,"password_trans");
                pairs[4] = new Pair<View,String>(login_button,"button_tran");
                pairs[5] = new Pair<View,String>(btn_register,"login_trans");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                startActivity(intent, options.toBundle());
            }
        });
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



    }
}
