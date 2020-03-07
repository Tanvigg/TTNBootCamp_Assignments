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


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output= inflater.inflate(R.layout.fragment_b, container, false);
        Log.d("methods","onCreateView fragmentB-->");
        Toast.makeText(getContext(),"OnCreateView FragmentB",Toast.LENGTH_LONG).show();

        return output;

    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("methods","onAttach fragmentB-->");
        Toast.makeText(getContext(),"OnAttach FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("methods","onCreate fragmentB-->");
        Toast.makeText(getContext(),"OnCreate FragmentB",Toast.LENGTH_LONG).show();


    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("methods","onActivityCreated fragmentB-->");
        Toast.makeText(getContext(),"OnActivityCreated FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("methods","onStart fragmentB-->");
        Toast.makeText(getContext(),"OnStart FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("methods","onResume fragmentB-->");
        Toast.makeText(getContext(),"OnResume FragmentB",Toast.LENGTH_LONG).show();



    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("methods","onPause fragmentB-->");
        Toast.makeText(getContext(),"OnCreateView FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("methods","onStop fragmentB-->");
        Toast.makeText(getContext(),"OnStop FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("methods","onDestroyView fragmentB-->");
        Toast.makeText(getContext(),"OnDestroyView FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("methods","onDestroy fragmenB-->");
        Toast.makeText(getContext(),"OnDestroy FragmentB",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("methods","onDetach fragmentB-->");
        Toast.makeText(getContext(),"OnDetach FragmentB",Toast.LENGTH_LONG).show();


    }
}
