package com.example.databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding.databinding.RowLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private Context context;
    private List<User> users = new ArrayList<>();

    public RecyclerAdapter(Context context,List<User> users){
        this.context = context;
        this.users = users;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowLayoutBinding rowLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.row_layout,parent,false);
        return new RecyclerViewHolder(rowLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        User user = users.get(position);
        holder.rowLayoutBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
