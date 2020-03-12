package com.example.roomdatabaseassess.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomdatabaseassess.R;
import com.example.roomdatabaseassess.RoomDatabase.EmployeeDatabase;
import com.example.roomdatabaseassess.model.EmployeeModel;

public class AddEmpActivity extends AppCompatActivity {
    private EditText nameEditText, addressEditText, mobileEditText;
    private String name, address, mobile;
    private Button addEmployeeButton;
    private Boolean IS_UPDATE=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_emp);

        nameEditText = findViewById(R.id.nameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        mobileEditText = findViewById(R.id.mobileEditText);


        //getIntentData();


        addEmployeeButton = findViewById(R.id.addButton);

        addEmployeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveEmployee();

            }
        });
    }


   /* private void  getIntentData()
    {
        if(getIntent().hasExtra("record"))
        {
            IS_UPDATE = true;
            addEmployeeButton.setText("UPDATE");
            EmployeeModel employeeModel =(EmployeeModel)getIntent().getSerializableExtra("record");
            nameEditText.setText(employeeModel.getName());
            addressEditText.setText(employeeModel.getAddress());
            mobileEditText.setText(employeeModel.getMobile());
        }

    }*/
    private void saveEmployee() {
        name = nameEditText.getText().toString();
        address = addressEditText.getText().toString();
        mobile = mobileEditText.getText().toString();

        //calling asyncTask class
        SaveEmployeeRecordsTask saveEmployeeRecordsTask = new SaveEmployeeRecordsTask();
        saveEmployeeRecordsTask.execute();


    }

    class SaveEmployeeRecordsTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setName(name);
            employeeModel.setAddress(address);
            employeeModel.setMobile(mobile);

            //adding Model class to database

            EmployeeDatabase.getInstance(getApplicationContext())
                    .getemployeeDao().insertEmployeeDDetails(employeeModel);

            return null;
        }

        //onPost


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            finish();
            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            Toast.makeText(getApplicationContext(), "Record saved..", Toast.LENGTH_LONG).show();
        }
    }

}
