package com.kepler.collections.clicker;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        replaceFragment(new FrgProfile());
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    protected int getNewTitle() {
        return R.string.home;
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_home;
    }
}
