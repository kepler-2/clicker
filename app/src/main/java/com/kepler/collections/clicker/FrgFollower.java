package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Amit on 04-05-2017.
 */

public class FrgFollower extends FrgBase {

    private  static FrgFollower frgHomeInstance;
    private Profile activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=(Profile) getActivity();
    }

    @Override
    protected int getContentView() {
        return R.layout.home;
    }


    public static FrgFollower getInstance(){
        if(frgHomeInstance==null){
            frgHomeInstance=new FrgFollower();
        }
           return frgHomeInstance;
    }
}
