package com.example.roomdatabaseassess.model;


import android.util.Log;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.roomdatabaseassess.util.Constants;

import java.io.Serializable;

@Entity(tableName = Constants.TABLE_NAME)

public class EmployeeModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public int uId;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "mobile")
    private String mobile;


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
