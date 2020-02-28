package com.example.recycleviewassess;

public class MyModel {
    private String heading;
    private String content;

    private int type;
    public static final int ONE_TYPE = 1;
    public static final int TWO_TYPE = 2;

    public MyModel(String heading, String content, int type) {
        this.heading = heading;
        this.content = content;
        this.type = type;

    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static int getOneType() {
        return ONE_TYPE;
    }

    public static int getTwoType() {
        return TWO_TYPE;
    }
}
