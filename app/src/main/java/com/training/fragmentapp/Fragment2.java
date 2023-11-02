package com.training.fragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment2 extends ListFragment {

    String[] AndroidApps=new String[]{
            "Anroid app"
            ,"Anroid pro app"
            ,"Kotlin"
    };

    String[] Description= new String[]{
            "1 lakh download",
            "10 lakh download",
            "1 Million download"
    };


    public Fragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_2,
                container,false);
        ArrayAdapter<String > adapter= new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                AndroidApps);
        setListAdapter(adapter);



        return view;

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        Fragment1 txt= (Fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApps[position], "Download: "+ Description[position]);
        getListView().setSelector(android.R.color.holo_blue_bright);
    }
}