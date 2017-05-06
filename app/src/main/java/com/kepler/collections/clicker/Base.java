package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Amit on 04-05-2017.
 */

public abstract class Base extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
        setNewTitle(R.string.app_name);
    }


    protected void setSubTitle(int subTitle) {
        if (getSupportActionBar() != null && subTitle != 0) {
            getSupportActionBar().setSubtitle(subTitle);
        }
    }

    protected void setNewTitle(int title) {
        if (getSupportActionBar() != null) {
            setTitle(title);
        }
    }

    protected void setBackButtonEnable() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    protected abstract int getContentView();
}
