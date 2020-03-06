package com.example.question3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerView extends RecyclerView.Adapter<ViewHolderRecyclerView> {
    Context context;



    @NonNull
    @Override
    public ViewHolderRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowlayoutView = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHolderRecyclerView(rowlayoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRecyclerView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
