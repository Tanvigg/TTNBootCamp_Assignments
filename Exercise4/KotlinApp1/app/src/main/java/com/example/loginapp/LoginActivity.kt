package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var btn_sign_out : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_out = findViewById(R.id.sign_out)

        btn_sign_out.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}
