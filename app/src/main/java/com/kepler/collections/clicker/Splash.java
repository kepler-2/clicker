package com.kepler.collections.clicker;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        action();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_splash;
    }

    private void action() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(Splash.this, Home.class);
                onBackPressed();
            }
        }, 3000);
    }

    public static void startActivity(AppCompatActivity appCompatActivity, Class<? extends Base> nxtClass) {
        Intent intent = new Intent(appCompatActivity, nxtClass);
        appCompatActivity.startActivity(intent);
    }
}
