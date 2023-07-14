package com.example.controlingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    public void playAudio(View view){

        mPlayer.start();
        AudioManager audioManager;
    }
    public void pauseAudio(View view){

        mPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mPlayer = MediaPlayer.create(this, R.raw.limbo);

       SeekBar musicControl = (SeekBar) findViewById(R.id.seekBar);
       musicControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

               Log.i("SeekBar Value", Integer.toString(progress));

           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });
    }
}