package com.example.livedata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.livedata.data.User;
import com.example.livedata.databinding.RowLayoutBinding;

import java.util.ArrayList;
import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private List<User> users = new ArrayList<>();
    private OnItemClickListener listener;


    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowLayoutBinding rowLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.row_layout,parent,false);
        return new UserHolder(rowLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        User user = users.get(position);
        holder.rowLayoutBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public void setData(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    public User getUserAt(int position) {
        return users.get(position);
    }

    class UserHolder extends RecyclerView.ViewHolder {
        RowLayoutBinding rowLayoutBinding;

        public UserHolder(@NonNull RowLayoutBinding itemView) {
            super(itemView.getRoot());

            rowLayoutBinding = itemView;
            itemView.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (listener != null && position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(users.get(position));
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(User user);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
