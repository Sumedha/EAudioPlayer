package com.example.android.eaudioplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
    }

    public void openEAudioPlayer(View view) {
        Intent eaudioplayer = new Intent(this, EAudioPlayer.class);
        startActivity(eaudioplayer);
    }
}
