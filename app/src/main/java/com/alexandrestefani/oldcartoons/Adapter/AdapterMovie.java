package com.alexandrestefani.oldcartoons.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexandrestefani.oldcartoons.Model.Movies;
import com.alexandrestefani.oldcartoons.R;


import java.util.List;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MyViewHolder> {

    private List<Movies> listMovies;

    //vincula-se a lista criada ao adapter:
    public AdapterMovie(List<Movies> list) {
        this.listMovies = list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        // criar o layout, feita a criação do layout fazer
        // Fazer a conversão do layout XML em View para poder aparecer ao usuário

        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent,false);
        return new MyViewHolder(itemList);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movies movie = listMovies.get(position);
        holder.imageMovie.setImageResource(movie.getMovie_picture());


    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageMovie;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMovie = itemView.findViewById(R.id.movie_image);


        }
    }

}

