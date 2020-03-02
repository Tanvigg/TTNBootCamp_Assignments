package com.example.recycleviewassess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class Question2Adapter extends RecyclerView.Adapter {
    public ArrayList<MyModel> myModels;
    Context context;


    public Question2Adapter(Context context,ArrayList<MyModel> myModels) {
        this.myModels = myModels;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case MyModel.ONE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout1, parent, false);
                return new Question2ViewHolder1(view);
            case MyModel.TWO_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout2, parent, false);
                return new Question2ViewHolder2(view);

        }
        return null;

    }


    @Override
    public int getItemViewType(int position) {
        switch (myModels.get(position).type){
            case 1:
                return MyModel.ONE_TYPE;
            case 2:
                return MyModel.TWO_TYPE;
            default:
                return -1;
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel model = myModels.get(position);
        if (model != null) {
            switch (model.type) {
                case MyModel.ONE_TYPE:

                    ((Question2ViewHolder1) holder).image1.setImageResource(model.getImage());
                    ((Question2ViewHolder1) holder).heading1.setText(model.heading);
                    ((Question2ViewHolder1) holder).content1.setText(model.content);

                    break;
                case MyModel.TWO_TYPE:

                    ((Question2ViewHolder2) holder).image.setImageResource(model.getImage());
                    ((Question2ViewHolder2) holder).heading.setText(model.heading);
                    ((Question2ViewHolder2) holder).content.setText(model.content);

            }

        }
    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }
}
