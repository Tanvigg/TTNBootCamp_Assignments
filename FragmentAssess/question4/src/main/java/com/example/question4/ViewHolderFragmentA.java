package com.example.question4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderFragmentA extends RecyclerView.ViewHolder {
    TextView name,serial;



    public ViewHolderFragmentA(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.nameText);
        serial = itemView.findViewById(R.id.serial);
    }
}