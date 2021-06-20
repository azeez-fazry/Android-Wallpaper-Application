package com.example.wallpaperapplication;
/**
 * Created by Azeez Fazry on 2021-06-19 1:48 AM
 *
 *      git: azeez-fazry
 */

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer myTimer = new Timer();
    Drawable drawable;
    WallpaperManager wallpaperManager;
    int img = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wallpaperManager = WallpaperManager.getInstance(this);
    }


    public void buChangeWallpaperrAction(View view) {
        myTimer.schedule(new TimerTask() {
            public void run() {
                if(img == 1) {

                    drawable = getResources().getDrawable(R.drawable.wallpaper1);
                    img = 2;
                } else if(img == 2) {
                    drawable = getResources().getDrawable(R.drawable.wallpaper1);
                    img = 3;
                } else if(img == 3) {
                    drawable = getResources().getDrawable(R.drawable.wallpaper1);
                    img = 4;
                } else if(img == 4) {
                    drawable = getResources().getDrawable(R.drawable.wallpaper1);
                    img = 5;
                } else {
                    drawable = getResources().getDrawable(R.drawable.wallpaper1);
                    img = 1;
                }
                Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
                try{
                    wallpaperManager.setBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },0,10000);
    }
}