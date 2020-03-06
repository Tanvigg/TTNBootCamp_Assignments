package com.example.question3;

public class MyModel {
    int position;
    String name,mobile;

    public MyModel(int position, String name, String mobile) {
        this.position = position;
        this.name = name;
        this.mobile = mobile;
    }


    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

}


