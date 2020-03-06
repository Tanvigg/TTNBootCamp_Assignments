package com.example.question3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderRecyclerView extends RecyclerView.ViewHolder {
    TextView e_position, e_name, e_mobile;
    Button e_edit,e_delete;

    public ViewHolderRecyclerView(@NonNull View itemView) {
        super(itemView);
        e_position = itemView.findViewById(R.id.position);
        e_name = itemView.findViewById(R.id.name);
        e_mobile = itemView.findViewById(R.id.mobile);
        e_edit = itemView.findViewById(R.id.btn_edit);
        e_delete = itemView.findViewById(R.id.btn_delete);

    }
}
