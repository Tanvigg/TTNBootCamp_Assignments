package com.example.viewmodel;

import android.content.res.Configuration;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();
    MainActivityColorGenerator model;
    ConstraintLayout parent;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        parent = findViewById(R.id.parent);

        Button btColor = findViewById(R.id.btColor);
        model = ViewModelProviders.of(this).get(MainActivityColorGenerator.class);
        color = model.getColor();

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            btColor.setVisibility(View.GONE);
            parent.setBackgroundColor(color);
        } else {
            btColor.setVisibility(View.VISIBLE);
            btColor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    parent.setBackgroundColor(color);
                }
            });
        }
    }
}

