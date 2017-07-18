package com.example.text.testproject.Adapter;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.text.testproject.Model.Videos_model;
import com.example.text.testproject.R;

import java.util.List;

/**
 * Created by btplws012 on 17/7/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Videos_model> moviesList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name1, name2, name3;
        ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name1 = (TextView) view.findViewById(R.id.name1);
            name2 = (TextView) view.findViewById(R.id.name2);
            name3 = (TextView) view.findViewById(R.id.name3);
            image = (ImageView) view.findViewById(R.id.image);
        }
    }


    public MoviesAdapter(Context context,List<Videos_model> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_layout, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Videos_model videos_model = moviesList.get(position);
        holder.name1.setText(videos_model.getName1());
        holder.name2.setText(videos_model.getName2());
        holder.name3.setText(videos_model.getName3());
        holder.image.setImageResource(videos_model.getImage());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}