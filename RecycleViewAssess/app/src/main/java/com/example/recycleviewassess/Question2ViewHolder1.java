package com.example.recycleviewassess;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Question2ViewHolder1 extends RecyclerView.ViewHolder {
     ImageView image1;
     TextView heading1;
     TextView content1;


    public Question2ViewHolder1(@NonNull View itemView) {
        super(itemView);
        image1 = itemView.findViewById(R.id.image1);
        heading1 = itemView.findViewById(R.id.heading1);
        content1 = itemView.findViewById(R.id.content1);

    }
}
