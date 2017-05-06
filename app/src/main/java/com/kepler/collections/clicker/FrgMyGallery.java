package com.kepler.collections.clicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import com.kepler.collections.clicker.adapte.Gallery;
import com.kepler.collections.clicker.adapte.HomeAdapter;
import com.kepler.collections.clicker.support.EmptyRecyclerView;

import butterknife.BindView;

/**
 * Created by Amit on 04-05-2017.
 */

public class FrgMyGallery extends FrgBase {
    @BindView(R.id.recyler_view)
    EmptyRecyclerView recyclerView;
    @BindView(R.id.list_empty_view)
    LinearLayout list_empty_view;
    private static FrgMyGallery frgHomeInstance;
    private Profile activity;
    private Gallery gallery;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (Profile) getActivity();
    }

    @Override
    protected int getContentView() {
        return R.layout.home;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));
        recyclerView.setEmptyView(list_empty_view);
        gallery = new Gallery(activity.getApplicationContext());
        recyclerView.setAdapter(gallery);
    }


    public static FrgMyGallery getInstance() {
        if (frgHomeInstance == null) {
            frgHomeInstance = new FrgMyGallery();
        }
        return frgHomeInstance;
    }
}
