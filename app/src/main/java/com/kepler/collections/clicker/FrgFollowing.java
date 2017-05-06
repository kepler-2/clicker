package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Amit on 04-05-2017.
 */

public class FrgFollowing extends FrgBase {

    private  static FrgFollowing frgHomeInstance;
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



    public static FrgFollowing getInstance(){
        if(frgHomeInstance==null){
            frgHomeInstance=new FrgFollowing();
        }
           return frgHomeInstance;
    }
}
