package com.example.recycleviewassess;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

import javax.net.ssl.HostnameVerifier;

import static com.example.recycleviewassess.MyModel.ONE_TYPE;
import static com.example.recycleviewassess.MyModel.TWO_TYPE;

public class Question2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<MyModel> myModels;


    public Question2Adapter(List<MyModel> myModels) {
        this.myModels = myModels;
    }

    @Override
    public int getItemViewType(int position) {
        MyModel model = myModels.get(position);
        if(model!=null){
            model.getType();

        }

        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType){
            case ONE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout1,parent,false);
                return new Question2ViewHolder1(view);
            case TWO_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout2,parent,false);
                return new Question2ViewHolder2(view);

        }
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel model = myModels.get(position);
        switch (model.getType()){
            case ONE_TYPE:


            case TWO_TYPE:



        }

    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }
}
