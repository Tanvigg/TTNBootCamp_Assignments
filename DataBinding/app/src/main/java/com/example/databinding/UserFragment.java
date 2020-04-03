package com.example.databinding;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.databinding.FragmentUserBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {
    private RecyclerAdapter adapter;
    private FragmentUserBinding userBinding;



    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_user, container, false);
        userBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_user,container,false);
        View output = userBinding.getRoot();

        userBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        userBinding.recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(getContext(),prepareUser());
        userBinding.recyclerView.setAdapter(adapter);
        return output;
    }


    private List<User> prepareUser() {
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> email = Arrays.asList(getResources().getStringArray(R.array.emails));
        List<String> phone = Arrays.asList(getResources().getStringArray(R.array.phoneNumber));
        List<User> Names = new ArrayList<>();

        int count = 0;
        for (String name : names) {
            Names.add(new User(name, email.get(count), phone.get(count)));
            count++;
        }
        return Names;
    }
}
