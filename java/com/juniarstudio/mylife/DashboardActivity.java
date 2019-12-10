package com.juniarstudio.mylife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.juniarstudio.mylife.Home.HomeFragment;
import com.juniarstudio.mylife.Story.StoryFragment;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView bnv = findViewById(R.id.bottomNavigationView);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new HomeFragment()).commit();
                        return true;
                    case R.id.item_story:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new StoryFragment()).commit();
                        return true;
                    case R.id.item_notification:
                        startActivity(new Intent(DashboardActivity.this, NotificationActivity.class));
                        return false;
                    default:
                        return false;
                }
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new HomeFragment()).commit();
    }
}
