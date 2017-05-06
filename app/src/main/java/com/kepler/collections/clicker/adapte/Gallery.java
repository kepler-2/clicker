package com.kepler.collections.clicker.adapte;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kepler.collections.clicker.R;
import com.kepler.collections.clicker.support.Home;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Amit on 05-05-2017.
 */

public class Gallery extends RecyclerView.Adapter<Gallery.HomeHolder> {

    private final Context mContext;
    private List<Home> homeItems = new ArrayList<>();

    public Gallery(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(
                R.layout.gallery,
                parent, false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeHolder holder, int position) {
//        Home home = homeItems.get(position);
//        holder.bind(home);
        holder.bind(null);
    }

    @Override
    public int getItemCount() {
        return 10;
//        return homeItems.size();
    }

    class HomeHolder extends RecyclerView.ViewHolder {
        //        private Home home;

        public HomeHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bind(Home home) {
//            home = home;
        }
    }
}
