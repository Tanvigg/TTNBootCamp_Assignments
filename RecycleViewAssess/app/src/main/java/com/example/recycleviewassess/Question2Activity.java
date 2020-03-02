package com.example.recycleviewassess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Question2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        ArrayList<MyModel> myModels;
        myModels = addData();

        recyclerView = findViewById(R.id.recycleview1);

        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        Question2Adapter adapter = new Question2Adapter(Question2Activity.this, myModels);
        recyclerView.setAdapter(adapter);
    }


    //Adding data to Model Class Constructor.
    ArrayList<MyModel> addData() {
        ArrayList<MyModel> data = new ArrayList<>();
        {
            data.add(new MyModel("The Times of India", "World prepares for coronavirus pandemic; global recession feared", MyModel.ONE_TYPE, R.drawable.img1));
            //            data.add(new Model(Model.SMALL_BANNER_TYPE, R.drawable.image2, "Hindustan Times","India vs New Zealand prediction: India predicted XI for 2nd Test - Virat Kohli could opt for two big..."));
            //            data.add(new Model(Model.BANNER_TYPE, R.drawable.image1, "The Times of India","World prepares for coronavirus pandemic; global recession feared"));
            data.add(new MyModel("Hindustan Times", "India vs New Zealand prediction: India predicted XI for 2nd Test - Virat Kohli could opt for two big...", MyModel.TWO_TYPE, R.drawable.img));
            data.add(new MyModel("Engadget","Facebook is suing a shady SDK developer.", MyModel.TWO_TYPE, R.drawable.fb));

            //            data.add(new Model(Model.SMALL_BANNER_TYPE, R.drawable.image3, "Engadget","Facebook is suing a shady SDK developer."));
            //        }
            return data;
        }

    }
}