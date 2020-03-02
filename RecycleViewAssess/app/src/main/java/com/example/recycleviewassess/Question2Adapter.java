package com.example.recycleviewassess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

import javax.net.ssl.HostnameVerifier;

import static com.example.recycleviewassess.MyModel.ONE_TYPE;
import static com.example.recycleviewassess.MyModel.TWO_TYPE;

public class Question2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<MyModel> myModels;
    Context context;


    public Question2Adapter(Context context,List<MyModel> myModels) {
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
            case 0:
                return ONE_TYPE;
            case 1:
                return TWO_TYPE;
            default:
                return -1;
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel model = myModels.get(position);
        if (model != null) {
            switch (model.type) {
                case ONE_TYPE:
                    ((Question2ViewHolder1) holder).heading.setText(model.heading);
                    ((Question2ViewHolder1) holder).content.setText(model.content);
                    Picasso.get().load(R.drawable.img1).into(((Question2ViewHolder1) holder).image);
                case TWO_TYPE:
                    ((Question2ViewHolder2) holder).heading.setText(model.heading);
                    ((Question2ViewHolder2) holder).content.setText(model.content);
                    Picasso.get().load(R.drawable.img).into(((Question2ViewHolder2) holder).image);
            }

        }
    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }
}
