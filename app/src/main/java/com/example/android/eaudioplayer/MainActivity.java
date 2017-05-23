package com.example.android.eaudioplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setTitle("EAudio Player");
        setSupportActionBar(toolbar);
    }

    public void openPlaylist(View view) {
        tToast("Playlist!");
        Intent playlists = new Intent(this, Playlists.class);
        startActivity(playlists);
    }

    public void openArtists(View view) {
        tToast("Artists!");
        Intent artists = new Intent(this, Artists.class);
        startActivity(artists);
    }

    public void openAlbums(View view) {
        tToast("Albums!");
        Intent albums = new Intent(this, Albums.class);
        startActivity(albums);
    }

    public void openSongs(View view) {
        tToast("Songs!");
        Intent songs = new Intent(this, Songs.class);
        startActivity(songs);
    }

    public void openGenres(View view) {
        tToast("Genres!");
        Intent genres = new Intent(this, Genres.class);
        startActivity(genres);
    }

    public void openBuyMusic(View view) {
        tToast("Buy Music!");
        Intent buymusic = new Intent(this, BuyMusicActivity.class);
        startActivity(buymusic);
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    }
}