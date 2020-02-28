package com.example.recycleviewassess;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHoldlerNames extends RecyclerView.ViewHolder {
     TextView serial;
     TextView name;

    public ViewHoldlerNames(@NonNull View itemView) {
        super(itemView);

        serial  = itemView.findViewById(R.id.serial);
        name = itemView.findViewById(R.id.nameText);

    }
}
