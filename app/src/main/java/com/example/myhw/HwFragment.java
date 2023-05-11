package com.example.myhw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HwFragment extends Fragment {


    private ArrayList<items_list> items_list;
    private RecyclerView recyclerView;
    LinearLayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initdata();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hw, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     initRecyclerView();

    }

    private void initdata() {
        items_list = new ArrayList<>();
        items_list.add(new items_list(R.drawable.rose, "rose is red", "rose"));
        items_list.add(new items_list(R.drawable.lilly, "lilly", "lilly is white"));
        items_list.add(new items_list(R.drawable.orchid, "orchid", "orchid is pink"));
        items_list.add(new items_list(R.drawable.tulip, "tulip", "tulip is red"));
        items_list.add(new items_list(R.drawable.carnation, "carnation", "carnation is lite brown"));
        items_list.add(new items_list(R.drawable.rose, "rose is red ", "rose"));
        items_list.add(new items_list(R.drawable.lilly, "lilly", "lilly is white"));
        items_list.add(new items_list(R.drawable.orchid, "orchid", "orchid is pink"));
        items_list.add(new items_list(R.drawable.tulip, "tulip", "tulip is red"));
        items_list.add(new items_list(R.drawable.carnation, "carnation", "carnation is lite brown"));
        items_list.add(new items_list(R.drawable.rose, "rose is red ", "rose"));
        items_list.add(new items_list(R.drawable.lilly, "lilly", "lilly is white"));
        items_list.add(new items_list(R.drawable.orchid, "orchid", "orchid is pink"));
        items_list.add(new items_list(R.drawable.tulip, "tulip", "tulip is red"));
        items_list.add(new items_list(R.drawable.carnation, "carnation", "carnation is lite brown"));

    }

    private void initRecyclerView() {

        recyclerView = getView().findViewById(R.id.recyclerview);
        MyAdapter myAdapter = new MyAdapter(getContext(), items_list);
        layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
       ;
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }
}