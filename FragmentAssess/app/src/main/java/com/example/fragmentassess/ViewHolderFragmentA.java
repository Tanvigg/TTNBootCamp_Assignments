package com.example.fragmentassess;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolderFragmentA extends RecyclerView.ViewHolder {
     TextView name,serial;



    public ViewHolderFragmentA(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.nameText);
        serial = itemView.findViewById(R.id.serial);
    }
}
