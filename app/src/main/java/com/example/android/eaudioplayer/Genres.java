package com.example.android.eaudioplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Genres extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        toolbar = (Toolbar) findViewById(R.id.toolbar4);
        toolbar.setTitle("Genres");
        setSupportActionBar(toolbar);

        final TextView textViewGenres1 = (TextView) findViewById(R.id.musicEAudioPlayerGenres1);
        textViewGenres1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), EAudioPlayer.class));
                tToast("Now Playing Shape Of You by Ed Sheeran!");
            }
        });
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, s, duration);
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        toast.show();
    }
}


