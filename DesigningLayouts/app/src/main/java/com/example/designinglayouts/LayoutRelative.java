package com.example.designinglayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class LayoutRelative extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView toolbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        toolbar = findViewById(R.id.toolbar);
        toolbar_title = findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);

        toolbar_title.setText("Restaurants");
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }
}
