package com.covidaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.covidaid.Fragement.BottomSheetFragment;
import com.covidaid.Fragement.DashboardFragment;
import com.covidaid.Fragement.DonateFragment;
import com.covidaid.Utils.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardScreen extends AppCompatActivity {
    FloatingActionButton openbottomsheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);
        openbottomsheet = findViewById(R.id.openbottomsheet);
        DashboardFragment dashboardFragment = new DashboardFragment();
        Utils.setDashboardFragment(dashboardFragment,getSupportFragmentManager());

        openbottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetFragment bottomSheet = new BottomSheetFragment();
                bottomSheet.show(getSupportFragmentManager(),
                        "ModalBottomSheet");

            }
        });


    }
}