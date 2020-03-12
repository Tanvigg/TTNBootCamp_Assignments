package com.example.roomdatabaseassess.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.telephony.CellInfoTdscdma;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdatabaseassess.Activity.AddEmpActivity;
import com.example.roomdatabaseassess.R;
import com.example.roomdatabaseassess.RoomDatabase.EmployeeDatabase;
import com.example.roomdatabaseassess.model.EmployeeModel;

import java.util.List;
import java.util.zip.Inflater;

import javax.sql.StatementEvent;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>{
    Context context;
    List<EmployeeModel> employeeModels;



    public ListAdapter(Context context,List<EmployeeModel> employeeModels) {
        this.context =context;
        this.employeeModels = employeeModels;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.nameTextView.setText(employeeModels.get(position).getName());
        holder.addressTextView.setText(employeeModels.get(position).getAddress());
        holder.mobileTextView.setText(String.valueOf(employeeModels.get(position).getMobile()));
        holder.textViewOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(context,holder.textViewOptions);
                popupMenu.inflate(R.menu.menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.update:
                                //opening add activity for updating the record
                                //passing serializable object
                                Intent intent = new Intent(context, AddEmpActivity.class);
                                intent.putExtra("record",employeeModels.get(position));
                                context.startActivity(intent);


                                break;
                            case R.id.delete:
                                deleteRecord(employeeModels.get(position),position);
                                break;

                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }

    private void deleteRecord(final EmployeeModel employeeModel, final int position) {
        class DeleteRecordTask extends AsyncTask<Void,Void,View>{
            @Override
            protected View doInBackground(Void... voids) {
                EmployeeDatabase.getInstance(context).getemployeeDao().deleteEmployee(employeeModel);
                return null;
            }

            @Override
            protected void onPostExecute(View view) {
                try{
                    employeeModels.remove(position);
                    notifyItemChanged(position);
                    Toast.makeText(context,"Record Deleted..",Toast.LENGTH_SHORT).show();
                }catch (Exception e){

                }
            }
        }

        DeleteRecordTask deleteRecordTask = new DeleteRecordTask();
        deleteRecordTask.execute();
    }

    @Override
    public int getItemCount() {
        return employeeModels.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView,addressTextView,mobileTextView;
        TextView textViewOptions;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            mobileTextView = itemView.findViewById(R.id.mobileTextView);
            textViewOptions = itemView.findViewById(R.id.textViewOptions);




        }


    }
}
