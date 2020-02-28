package com.example.recycleviewassess;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class Question2ViewHolder2 extends RecyclerView.ViewHolder {
     ImageView image;
     TextView heading,content;
    public Question2ViewHolder2(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.image);
        heading = itemView.findViewById(R.id.heading);
        content = itemView.findViewById(R.id.content);
    }
}
