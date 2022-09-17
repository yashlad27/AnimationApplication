package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean Bart = true;

    public void fade(View view){
        Log.i("info", "Image Pressed!");

        ImageView BartimageView = (ImageView) findViewById(R.id.BartimageView);
        ImageView HomerimageView = (ImageView) findViewById(R.id.HomerimageView);

        if(Bart){
            Bart = false;
            BartimageView.animate().alpha(0).setDuration(2000);
            HomerimageView.animate().alpha(1).setDuration(2000);
        }else{
            Bart = true;
            BartimageView.animate().alpha(1).setDuration(2000);
            HomerimageView.animate().alpha(0).setDuration(2000);
        }

//        BartimageView.animate().alpha(0).setDuration(2000);  // in miliseconds
//        HomerimageView.animate().alpha(1).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}