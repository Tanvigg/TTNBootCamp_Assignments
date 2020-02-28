package com.example.recycleviewassess;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.AbsListView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterNames adapterNames;
    private boolean isScrolling = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> Names = new ArrayList<String>();
        Names.add("Tanvi Gupta");
        Names.add("Ashutosh Shrivastawa");
        Names.add("Subarno Chatterji");
        Names.add("Lakshya Sharma");
        Names.add("Anupam Bharadwaj");
        Names.add("Naveen");
        Names.add("Ujjawal");
        Names.add("Astha Singh");
        Names.add("Priya");
        Names.add("Ankit Arora");
        Names.add("Akaansha Gupta");
        Names.add("Sanchit Sachdeva");
        Names.add("Ashita Kumar");
        Names.add("Saksham Sachdeva");
        Names.add("Rohit Kumar");
        Names.add("Ishita Garg");


        recyclerView = findViewById(R.id.recycleview);
        adapterNames = new AdapterNames(MainActivity.this, Names);


        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapterNames);


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                    isScrolling = true;
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstCompletelyVisibleItemPosition();

                    if (isScrolling && visibleItemCount + pastVisibleItems >= totalItemCount) {
                        Toast.makeText(MainActivity.this,"Loading more Items...",Toast.LENGTH_LONG).show();
                        isScrolling = false;
                        fetchData();

                    }
                }
            }

            private void fetchData() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Names.add("Parul Singh");
                        Names.add("Aman Gupta");
                        Names.add("Rahul Singh");
                        Names.add("Anurag Taneja");
                        Names.add("Pragya Singh");
                        Names.add("Amit Saha");
                        Names.add("Anu Singh");
                        Names.add("Gaurav Panchal");
                        Names.add("Radhika Aneja");
                        Names.add("Kritika Singh");
                        Names.add("Vijay Rathore");
                        Names.add("Gaurav Raghuvanshi");
                        Names.add("Smita Garg");
                        Names.add("Rachi Sharma");
                        Names.add("Isha Singh");
                        Names.add("Pallavi Maurya");
                        adapterNames.notifyDataSetChanged();


                    }
                }, 5000);
            }


        });


    }
}
