package com.example.recycleviewassess;

public class MyModel {
    public String heading;
    public String content;
    private int image;
    public int type;


    public static final int ONE_TYPE = 1;
    public static final int TWO_TYPE = 2;

    public MyModel(String heading, String content, int type, int image) {
        this.heading = heading;
        this.content = content;
        this.type = type;
        this.setImage(image);

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}