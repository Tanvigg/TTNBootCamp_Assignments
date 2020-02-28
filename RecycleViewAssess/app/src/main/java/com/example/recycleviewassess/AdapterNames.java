package com.example.recycleviewassess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNames extends RecyclerView.Adapter<ViewHoldlerNames> {
     ArrayList<String> dataSources;
     Context context;

    public AdapterNames(Context context,ArrayList<String> dataSource ){
        this.dataSources = dataSource;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHoldlerNames onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowLayout = inflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHoldlerNames(rowLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldlerNames holder, int position) {
        holder.serial.setText(String.valueOf(position+1));
        holder.name.setText(dataSources.get(position));

    }

    @Override
    public int getItemCount() {
        return dataSources.size();
    }
}
