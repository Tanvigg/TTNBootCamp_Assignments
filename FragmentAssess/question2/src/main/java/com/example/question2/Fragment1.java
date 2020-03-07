package com.example.question2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("methods", "OnCreateView called");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("methods", "OnActivityCreated called");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("methods", "OnAttach called ");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("methods", "OnCreate called");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("methods", "OnStart called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("methods", "OnResume called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("methods", "OnPause called");
    }



    @Override
    public void onStop() {
        super.onStop();
        Log.d("methods", "OnStop called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("methods", "DestroyView called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("methods", "onDestroy called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("methods", "OnDetach called");
    }
}

