package com.example.recycleviewassess;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Question2ViewHolder1 extends RecyclerView.ViewHolder {
     ImageView image;
     TextView heading;
     TextView content;


    public Question2ViewHolder1(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        heading = itemView.findViewById(R.id.heading);
        content = itemView.findViewById(R.id.content);

    }
}
