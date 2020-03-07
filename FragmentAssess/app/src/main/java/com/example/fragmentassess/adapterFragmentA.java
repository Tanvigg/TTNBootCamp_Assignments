package com.example.fragmentassess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterFragmentA extends RecyclerView.Adapter<ViewHolderFragmentA> {
    ArrayList<String> dataSource;
    Context context;

    public adapterFragmentA(Context context, ArrayList<String> dataSource) {
        this.dataSource = dataSource;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderFragmentA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowLayout = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new ViewHolderFragmentA(rowLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFragmentA holder, int position) {
        holder.serial.setText(String.valueOf(position+1));
        holder.name.setText(dataSource.get(position));

        holder.serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
