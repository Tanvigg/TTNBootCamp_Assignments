package com.example.databinding;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding.databinding.RowLayoutBinding;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    RowLayoutBinding rowLayoutBinding;


    public RecyclerViewHolder(@NonNull RowLayoutBinding itemView) {
        super(itemView.getRoot());
        rowLayoutBinding = itemView;

    }
}
