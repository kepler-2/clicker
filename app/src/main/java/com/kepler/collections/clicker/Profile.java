package com.kepler.collections.clicker;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.kepler.collections.clicker.adapte.ViewPagerAdapter;
import com.kepler.collections.clicker.support.Helper;

import butterknife.BindView;

public class Profile extends Base implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.htab_tabs)
    TabLayout htab_tabs;
    @BindView(R.id.htab_viewpager)
    ViewPager htab_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSubTitle(R.string.profile);
        setBackButtonEnable();
        htab_tabs.setupWithViewPager(htab_viewpager);
        htab_tabs.addOnTabSelectedListener(this);
        setupViewPager(htab_viewpager);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_profile;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        htab_viewpager.setCurrentItem(tab.getPosition());

        switch (tab.getPosition()) {
            case 0:
                Helper.showToast(getApplicationContext(), "One");
                break;
            case 1:
                Helper.showToast(getApplicationContext(), "Two");
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_settings:
                Splash.startActivity(Profile.this, Settings.class);
                return true;
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(FrgMyGallery.getInstance(), getResources().getString(R.string.gallery));
//        adapter.addFrag(FrgFollowing.getInstance(), getResources().getString(R.string.following));
        adapter.addFrag(FrgMyMissions.getInstance(), getResources().getString(R.string.missions));
//        adapter.addFrag(FrgFollower.getInstance(), getResources().getString(R.string.follower));
        viewPager.setAdapter(adapter);
    }
}
