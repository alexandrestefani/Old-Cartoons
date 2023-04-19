package com.alexandrestefani.oldcartoons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayMovie extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_movie);

        //recuperar informacoes
        Bundle dados = getIntent().getExtras();
        int position = dados.getInt("reference");
        System.out.println("iupiiiiiii "+position);

        videoView = findViewById(R.id.videoView);

        //esconder a barra
        getSupportActionBar().hide();

        //controle de imagem
        videoView.setMediaController(new MediaController(this));

        if(position ==0) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.brementown_musicians);
        } else if (position ==1) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.simple_simon);
        } else if (position ==2) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.gabby_king_for_a_day);
        } else if (position ==3) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.greedy_humpty_dumpty);
        }else{
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.old_mother_hubbard);

        }

        videoView.start();

    }




}