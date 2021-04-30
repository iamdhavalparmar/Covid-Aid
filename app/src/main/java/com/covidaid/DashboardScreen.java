package com.covidaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.covidaid.Fragement.DashboardFragment;
import com.covidaid.Fragement.DonateFragment;
import com.covidaid.Utils.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardScreen extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);

        DashboardFragment dashboardFragment = new DashboardFragment();
        Utils.setDashboardFragment(dashboardFragment,getSupportFragmentManager());
        bottomNavigationView  = findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.request_navigation:
                        DashboardFragment dashboardFragment = new DashboardFragment();
                        Utils.setDashboardFragment(dashboardFragment,getSupportFragmentManager());
                        break;
                    case R.id.donor_navigation:
                        DonateFragment donateFragment = new DonateFragment();
                        Utils.setDashboardFragment(donateFragment,getSupportFragmentManager());
                        break;
                    case R.id.profile_navigation:
                        break;
                    case R.id.othernavigation:
                        break;
                }
                return true;
            }
        });

    }
}