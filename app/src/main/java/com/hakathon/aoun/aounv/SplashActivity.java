package com.hakathon.aoun.aounv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import android.content.Intent;


public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent main = new Intent(SplashActivity.this,MainActivity.class);
               startActivity(main);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
