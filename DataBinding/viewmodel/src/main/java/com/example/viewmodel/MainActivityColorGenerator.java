package com.example.viewmodel;

import android.graphics.Color;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityColorGenerator extends ViewModel {
    private String TAG = this.getClass().getSimpleName();
    private int myRandomColor;

    public int getColor(){
        Log.i(TAG,"Get Color");
        if(myRandomColor == 0){
            createColor();
        }
        return myRandomColor;

    }

    private void createColor(){
        Log.i(TAG,"Create new Color");
        Random random =  new Random();
        myRandomColor = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG,"ViewModel Destroyed");
    }
}
