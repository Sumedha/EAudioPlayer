package com.example.android.eaudioplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPlaylists(View view) {
        Intent playlists = new Intent(this, Playlists.class);
        startActivity(playlists);
    }

    public void openArtists(View view) {
        Intent artists = new Intent(this, Artists.class);
        startActivity(artists);
    }

    public void openAlbums(View view) {
        Intent albums = new Intent(this, Albums.class);
        startActivity(albums);
    }

    public void openSongs(View view) {
        Intent songs = new Intent(this, Songs.class);
        startActivity(songs);
    }

    public void openGenres(View view) {
        Intent genres = new Intent(this, Genres.class);
        startActivity(genres);
    }
}

