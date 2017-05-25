package com.example.android.eaudioplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setTitle("EAudio Player");
        setSupportActionBar(toolbar);

        final Button buttonPlaylist = (Button) findViewById(R.id.musicPlaylists);
        buttonPlaylist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), Playlists.class));
                tToast("Playlist!");
            }
        });

        final Button buttonArtists = (Button) findViewById(R.id.musicArtists);
        buttonArtists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), Artists.class));
                tToast("Artists!");
            }
        });

        final Button buttonAlbums = (Button) findViewById(R.id.musicAlbums);
        buttonAlbums.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), Albums.class));
                tToast("Albums!");
            }
        });

        final Button buttonSongs = (Button) findViewById(R.id.musicSongs);
        buttonSongs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), Songs.class));
                tToast("Songs!");
            }
        });

        final Button buttonGenres = (Button) findViewById(R.id.musicGenres);
        buttonGenres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), Genres.class));
                tToast("Genres!");
            }
        });

        final Button buttonBuyMusic = (Button) findViewById(R.id.musicBuy);
        buttonBuyMusic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), BuyMusicActivity.class));
                tToast("Buy Music");
            }
        });
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    }
}