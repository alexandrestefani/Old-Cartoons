package com.alexandrestefani.oldcartoons.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import com.alexandrestefani.oldcartoons.Adapter.AdapterMovie;
import com.alexandrestefani.oldcartoons.Adapter.ClickListener;
import com.alexandrestefani.oldcartoons.Model.Movies;
import com.alexandrestefani.oldcartoons.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Movies> moviesList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.createMoviesList();

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        AdapterMovie adapter = new AdapterMovie(moviesList);
        recyclerView.setAdapter(adapter);


        //Evento de click

        recyclerView.addOnItemTouchListener(
                new ClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new ClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Movies movie = moviesList.get(position);
                                //Toast.makeText(getApplicationContext(),"item pressionado" + movie.getMovie_title(),Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(),Details.class);
                                intent.putExtra("reference",position);
                                intent.putExtra("reftitle",movie.getMovie_title());
                                intent.putExtra("refyear",movie.getMovie_year());
                                intent.putExtra("refsynopsis",movie.getMovie_text());
                                intent.putExtra("refimage",movie.getMovie_picture());

                                startActivity(intent);

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );


    }

    public void createMoviesList(){
        Movies movie0 = new Movies(
                "1935",
                "Brementown Musician",
                "Filme em tecnicolor baseado no conto conto dos Irmãos Grimm, sobre 4 animais que fogem da fazenda.",
                R.drawable.brementown_musicians
                );
        this.moviesList.add(movie0);

        Movies movie1 = new Movies(
                "1935",
                "Simple Simon",
                "Filme em tecnicolor feito por Ub Iwerks é uma animada história de Simon.",
                R.drawable.simple_simon
        );
        this.moviesList.add(movie1);

        Movies movie2 = new Movies(
                "1940",
                "Gabby: Rei por um dia",
                "Filme em tecnicolor feito por Dave e Max Fleisher e lançado pela Paramont, conta a aventura de Gabby.",
                R.drawable.king_for_a_day
        );
        this.moviesList.add(movie2);

        Movies movie3 = new Movies(
                "1936",
                "Ambicioso, corcunda e cheio",
                "Filme em tecnicolor feito por Dave Fleisher, trata de alguns temas morais.",
                R.drawable.greedy_humpty_dumpty
        );
        this.moviesList.add(movie3);


        Movies movie4 = new Movies(
                "1935",
                "Velha mãe Hubbard",
                "Filme em tecnicolor feito por Ub Iwerk. Feito em tecnicolor, retrata a vovó Hubbard.",
                R.drawable.old_mother_hubbar
        );
        this.moviesList.add(movie4);
    }
}