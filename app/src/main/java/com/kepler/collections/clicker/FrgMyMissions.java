package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import com.kepler.collections.clicker.adapte.Notification;
import com.kepler.collections.clicker.support.EmptyRecyclerView;

import butterknife.BindView;

/**
 * Created by Amit on 04-05-2017.
 */

public class FrgMyMissions extends FrgBase {

    private  static FrgMyMissions frgHomeInstance;
    private Profile activity;
    @BindView(R.id.recyler_view)
    EmptyRecyclerView recyclerView;
    @BindView(R.id.list_empty_view)
    LinearLayout list_empty_view;
    private Notification notification;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=(Profile) getActivity();
    }

    @Override
    protected int getContentView() {
        return R.layout.home;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setEmptyView(list_empty_view);
        notification = new Notification(activity.getApplicationContext());
        recyclerView.setAdapter(notification);
    }

    public static FrgMyMissions getInstance(){
        if(frgHomeInstance==null){
            frgHomeInstance=new FrgMyMissions();
        }
           return frgHomeInstance;
    }
}
