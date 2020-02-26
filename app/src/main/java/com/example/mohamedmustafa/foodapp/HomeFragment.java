package com.example.mohamedmustafa.foodapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamedmustafa.foodapp.ViewHolder.RecycleViewAdapter;
import com.example.mohamedmustafa.foodapp.model.order;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Context context;
    RecyclerView recyclerView;
    private List<order> orderList;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View homeView = inflater.inflate(R.layout.fragment_home, container, false);

        orderList = new ArrayList<>();
        orderList.add(new order(R.drawable.crop, "mac burger", "Burger with a large slice of meat and vegetables", "3.5", "45", 5));

        recyclerView = (RecyclerView) homeView.findViewById(R.id.home_recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecycleViewAdapter adapter = new RecycleViewAdapter(orderList);
        recyclerView.setAdapter(adapter);

        return homeView;
    }

}
