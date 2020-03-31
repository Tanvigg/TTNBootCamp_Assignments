package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sign_in_button.setOnClickListener {
            val username : String = login_username.text.toString()
            val pass : String = login_password.text.toString()
            if(TextUtils.isEmpty(username)){
                Toast.makeText(this,"Enter Username FirstName",LENGTH_SHORT).show()
            }
            else if(TextUtils.isEmpty(pass)){
                Toast.makeText(this,"Enter Password first", LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)


            }
        }
    }


}


