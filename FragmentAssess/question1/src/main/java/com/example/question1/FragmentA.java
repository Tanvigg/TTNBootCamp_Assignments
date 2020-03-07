package com.example.question1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragmentA extends Fragment {

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output= inflater.inflate(R.layout.fragment_a, container, false);


        Log.d("methods","onCreateView fragmentA-->");
        Toast.makeText(getContext(),"OnCreateView FragmentA",Toast.LENGTH_LONG).show();
        return output;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("methods","onAttach fragmentA-->");
        Toast.makeText(getContext(),"onAttach FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("methods","onCreate fragmentA-->");
        Toast.makeText(getContext(),"OnCreate FragmentA",Toast.LENGTH_LONG).show();


    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("methods","onActivityCreated fragmentA-->");
        Toast.makeText(getContext(),"OnActivityCreated FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("methods","onStart fragmentA-->");
        Toast.makeText(getContext(),"OnStart FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("methods","onResume fragmentA-->");
        Toast.makeText(getContext(),"OnResume FragmentA",Toast.LENGTH_LONG).show();



    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("methods","onPause fragmentA-->");
        Toast.makeText(getContext(),"OnCreateView FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("methods","onStop fragmentA-->");
        Toast.makeText(getContext(),"OnStop FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("methods","onDestroyView fragmentA-->");
        Toast.makeText(getContext(),"OnDestroyView FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("methods","onDestroy fragmentA-->");
        Toast.makeText(getContext(),"OnDestroy FragmentA",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("methods","onDetach fragmentA-->");
        Toast.makeText(getContext(),"OnDetach FragmentA",Toast.LENGTH_LONG).show();


    }
}
