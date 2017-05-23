package com.example.android.eaudioplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Playlists extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the layout of the Activity
        setContentView(R.layout.activity_playlists);

        toolbar = (Toolbar) findViewById(R.id.toolbar5);
        toolbar.setTitle("Genres");
        setSupportActionBar(toolbar);
    }

    public void openEAudioPlayer(View view) {
        Intent eaudioplayer = new Intent(this, EAudioPlayer.class);
        startActivity(eaudioplayer);
    }
}