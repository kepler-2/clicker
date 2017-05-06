package com.kepler.collections.clicker;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import butterknife.BindView;

public class Home extends Base implements View.OnClickListener {
    @BindView(R.id.home)
    ImageButton home;
    @BindView(R.id.missions)
    ImageButton missions;
    @BindView(R.id.camera)
    ImageButton camera;
    @BindView(R.id.notifications)
    ImageButton notifications;
    @BindView(R.id.profile)
    ImageButton profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        home.setOnClickListener(this);
        missions.setOnClickListener(this);
        camera.setOnClickListener(this);
        notifications.setOnClickListener(this);
        profile.setOnClickListener(this);
        replaceFragment(FrgHome.getInstance());
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_upload :
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.home,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_home;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home:
                replaceFragment(FrgHome.getInstance());
                break;
            case R.id.missions:
                replaceFragment(FrgMissions.getInstance());
                break;
            case R.id.camera:
                break;
            case R.id.notifications:
                replaceFragment(FrgNotifications.getInstance());
                break;
            case R.id.profile:
                Splash.startActivity(Home.this, Profile.class);
                break;
        }
    }
}
