package com.example.testprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.playButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    pause();
                } else {
                    play();
                }
            }
        });

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
    }

    public void play() {
        mediaPlayer.start();
        button.setText("O o ooohh ooohhhh");
    }

    public void pause() {
        mediaPlayer.pause();
        button.setText("See you again");
    }
}