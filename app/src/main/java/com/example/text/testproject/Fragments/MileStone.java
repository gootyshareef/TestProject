package com.example.text.testproject.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.text.testproject.Adapter.MoviesAdapter;
import com.example.text.testproject.Model.Videos_model;
import com.example.text.testproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by btplws012 on 17/7/17.
 */

public class MileStone extends Fragment {

    private List<Videos_model> movieList = new ArrayList<Videos_model>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    public MileStone(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.milestone_fragment, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.milestone_recycler);

        mAdapter = new MoviesAdapter(getActivity(),movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
        // Inflate the layout for this fragment
        return view;
    }

    private void prepareMovieData() {
        Videos_model viewModel = new Videos_model(R.drawable.a,"Avegers","18 hours","Lorem Ipsum, giving information on its origins");
        movieList.add(viewModel);

        viewModel = new Videos_model(R.drawable.b,"Avegers","18 hours","Lorem Ipsum, giving information on its origins");
        movieList.add(viewModel);

        viewModel = new Videos_model(R.drawable.b,"Avegers","18 hours","Lorem Ipsum, giving information on its origins");
        movieList.add(viewModel);

        viewModel = new Videos_model(R.drawable.c,"Avegers","18 hours","Lorem Ipsum, giving information on its origins");
        movieList.add(viewModel);

        viewModel = new Videos_model(R.drawable.a,"Avegers","18 hours","Lorem Ipsum, giving information on its origins");
        movieList.add(viewModel);

        mAdapter.notifyDataSetChanged();
    }
}
