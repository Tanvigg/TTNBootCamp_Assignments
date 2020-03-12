package com.example.roomdatabaseassess.RoomDatabase;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomdatabaseassess.model.EmployeeModel;
import com.example.roomdatabaseassess.util.Constants;

@androidx.room.Database(entities = {EmployeeModel.class}, version = 2)  //step1
public abstract class EmployeeDatabase extends RoomDatabase {
    public abstract EmployeeDao getemployeeDao(); //step2


    private static EmployeeDatabase INSTANCE;
    public static synchronized EmployeeDatabase getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),EmployeeDatabase.class, Constants.DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }
}
