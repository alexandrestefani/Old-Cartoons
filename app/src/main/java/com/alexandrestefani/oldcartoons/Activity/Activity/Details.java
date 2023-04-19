package com.alexandrestefani.oldcartoons.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alexandrestefani.oldcartoons.Model.Movies;
import com.alexandrestefani.oldcartoons.PlayMovie;
import com.alexandrestefani.oldcartoons.R;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {

    private TextView title, year, synopsis;
    private ImageView image, imagePlay;
    private Button button;

    private List<Movies> moviesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //recuperar a position selecionada
        Bundle dados = getIntent().getExtras();
        int position = dados.getInt("reference");
        String titleMovie = dados.getString("reftitle");
        String yearMovie = dados.getString("refyear");
        String synopsisMovie = dados.getString("refsynopsis");
        int imageMovie = dados.getInt("refimage");
        System.out.println("iuppiii"+ position );


        title = findViewById(R.id.title_details);
        year = findViewById(R.id.year_details);
        synopsis = findViewById(R.id.text_details);
        image = findViewById(R.id.image_details);

        title.setText(titleMovie);
        year.setText(yearMovie);
        synopsis.setText(synopsisMovie);
        image.setImageResource(imageMovie);
        imagePlay = findViewById(R.id.image_play);
        imagePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(getApplicationContext(), PlayMovie.class);
                intent2.putExtra("reference",position);
                startActivity(intent2);

            }
        });







    }

}