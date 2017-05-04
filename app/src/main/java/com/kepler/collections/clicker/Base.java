package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Amit on 04-05-2017.
 */

public abstract class Base extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        if (getSupportActionBar() != null) {
            setTitle(getNewTitle());
        }
    }

    protected abstract int getNewTitle();

    protected abstract int getContentView();
}
