package com.example.roomdatabaseassess.Activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.example.roomdatabaseassess.R;
import com.example.roomdatabaseassess.RoomDatabase.EmployeeDatabase;
import com.example.roomdatabaseassess.adapter.ListAdapter;
import com.example.roomdatabaseassess.model.EmployeeModel;
import com.example.roomdatabaseassess.util.wrapContentLinearLayoutManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListAdapter adapter;
    private List<EmployeeModel> employeeModels;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we are gonna add addEmployee Activity here
                startActivity(new Intent(Main2Activity.this, AddEmpActivity.class));

            }
        });

        //adding dummy data to the list

        employeeModels = new ArrayList<>();


      /*  EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName("Harry");
        employeeModel.setAddress("Noida");
        employeeModel.setMobile("9871863500");


        employeeModels.add(employeeModel);
        employeeModels.add(employeeModel);
*/


        recyclerView = findViewById(R.id.recycleView);

        //calling method to get the data from the database
        getEmployeeDetails();


    }

    private void getEmployeeDetails() {

        class GetEmployeeDataTask extends AsyncTask<Void, Void, List<EmployeeModel>> {

            @Override
            protected List<EmployeeModel> doInBackground(Void... voids) {
                List<EmployeeModel> employeeModels = EmployeeDatabase
                        .getInstance(getApplicationContext()).getemployeeDao().getEmployeeDetails();

                return employeeModels;
            }

            @Override
            protected void onPostExecute(List<EmployeeModel> employeeModels) {
                super.onPostExecute(employeeModels);


                recyclerView.setLayoutManager(new wrapContentLinearLayoutManager(Main2Activity.this,LinearLayoutManager.VERTICAL,false));
                adapter = new ListAdapter(Main2Activity.this, employeeModels);
                recyclerView.setAdapter(adapter);
            }
        }

        GetEmployeeDataTask getEmployeeDataTask = new GetEmployeeDataTask();
        getEmployeeDataTask.execute();
    }

}
