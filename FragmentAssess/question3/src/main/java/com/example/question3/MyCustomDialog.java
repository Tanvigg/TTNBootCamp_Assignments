package com.example.question3;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyCustomDialog extends DialogFragment{
    private EditText mInput;
    private Button mActionOk,mActionCancel;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rowLayout = inflater.inflate(R.layout.dialog_layout,container,false);
        mActionOk = rowLayout.findViewById(R.id.action_ok);
        mActionCancel = rowLayout.findViewById(R.id.action_cancel);
        mInput = rowLayout.findViewById(R.id.input);

        mActionCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Closing Dialog...");
                getDialog().dismiss();

            }
        });


        mActionOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Capturing Input...");
                String input = mInput.getText().toString();
                if(!input.equals("")){
                    ((DialogFragmentActivity)getActivity()).mInputDisplay.setText(input);

                }
                getDialog().dismiss();


            }
        });

        return rowLayout;



    }
}
