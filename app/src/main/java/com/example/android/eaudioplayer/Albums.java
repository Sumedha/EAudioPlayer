package com.example.android.eaudioplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_albums);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Albums");
        setSupportActionBar(toolbar);

        final LinearLayout linearLayoutViewAlbum1 = (LinearLayout) findViewById(R.id.firstAlbum);
        linearLayoutViewAlbum1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), EAudioPlayer.class));
                tToast("Now Playing Shape Of You by Ed Sheeran!");
            }
        });

        final LinearLayout linearLayoutViewAlbum2 = (LinearLayout) findViewById(R.id.secondAlbum);
        linearLayoutViewAlbum2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), EAudioPlayer2.class));
                tToast("Now Playing Careless Whisper by George Michael!");
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
