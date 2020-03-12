package com.example.roomdatabaseassess.RoomDatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabaseassess.model.EmployeeModel;
import com.example.roomdatabaseassess.util.Constants;

import java.util.List;

@Dao
public interface EmployeeDao {

    //checking for inserting data for now
    @Insert
    void insertEmployeeDDetails(EmployeeModel employeeModel );

    //show data
    @Query("SELECT * FROM " + Constants.TABLE_NAME)
    List<EmployeeModel> getEmployeeDetails();

    @Delete
    void deleteEmployee(EmployeeModel employeeModel);

    @Update
    void updateEmployeeDetails(EmployeeModel employeeModel);
}
