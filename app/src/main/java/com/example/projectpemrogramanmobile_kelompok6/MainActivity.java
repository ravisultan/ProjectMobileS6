package com.example.projectpemrogramanmobile_kelompok6;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.window.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectmobile.R;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=3000;
    //4000=4 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(MainActivity.this, splashscreen.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}