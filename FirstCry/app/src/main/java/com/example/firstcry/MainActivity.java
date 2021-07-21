package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoViewIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


        videoViewIntro.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.introduction);
        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoViewIntro);
        //allow mediaController to control our videoView
        videoViewIntro.setMediaController(mediaController);
        videoViewIntro.start();
        videoViewIntro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
                Intent intent=new Intent(MainActivity.this,AskUserActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        videoViewIntro=findViewById(R.id.videoViewIntro);
    }
}