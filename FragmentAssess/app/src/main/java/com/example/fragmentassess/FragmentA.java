package com.example.fragmentassess;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.FormatterClosedException;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    private RecyclerView names_recyclerView;
    private adapterFragmentA adapterFragmentA;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output = inflater.inflate(R.layout.fragment_a, container, false);
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Chaayos -Meri Wali Chai");
        Names.add("Wat -a -Burger!");
        Names.add("The China Wall");


        names_recyclerView = output.findViewById(R.id.names_recycleView);
        adapterFragmentA = new adapterFragmentA(getContext(),Names);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        names_recyclerView.setLayoutManager(layoutManager);

        names_recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

        names_recyclerView.setAdapter(adapterFragmentA);

        return output;
    }
}
