package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    FragmentA fragmentA = new FragmentA();
    FragmentB fragmentb = new FragmentB();
    FrameLayout container;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
        Log.d("method","onCreate main----->");
        Toast.makeText(MainActivity.this,"OnCreated main",Toast.LENGTH_LONG).show();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container,fragmentb);
                fragmentTransaction.commit();

            }
        });

        fragmentTransaction.add(R.id.container,fragmentA);
        fragmentTransaction.commit();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("method","onStart main----->");
        Toast.makeText(MainActivity.this,"OnStart main",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("method","onResume main----->");
        Toast.makeText(MainActivity.this,"OnResume main",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("method","onPause main----->");
        Toast.makeText(MainActivity.this,"OnPause main",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("method","onStop main----->");
        Toast.makeText(MainActivity.this,"OnStop main",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("method","OnDestroy main----->");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("method","onRestart main----->");
        Toast.makeText(MainActivity.this,"OnRestart main",Toast.LENGTH_LONG).show();


    }


}
