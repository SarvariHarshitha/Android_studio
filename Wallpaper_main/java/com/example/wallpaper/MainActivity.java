package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    boolean running;
    int [] arr = new int[]{R.drawable.wallpaper1, R.drawable.wallpaper2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(!running){
            new Timer().schedule(new MyTimer(), 0, 3000);
            running = true;

        }
    }


    private class MyTimer extends TimerTask {

        @Override
        public void run() {
            try {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getBaseContext());
                Random random = new Random();
                wallpaperManager.setBitmap(BitmapFactory .decodeResource(getResources(), arr[random.nextInt(2)]));
            }catch(IOException e){}

        }
    }
}