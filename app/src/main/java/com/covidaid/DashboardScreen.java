package com.covidaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.covidaid.Fragement.BottomSheetFragment;
import com.covidaid.Fragement.DashboardFragment;
import com.covidaid.Fragement.DonateFormFragment;
import com.covidaid.Fragement.DonateFragment;
import com.covidaid.Fragement.OtherInfoFormFragment;
import com.covidaid.Fragement.OtherInfoFragment;
import com.covidaid.Fragement.ProfileFragment;
import com.covidaid.Fragement.RequestFormFragment;
import com.covidaid.Utils.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardScreen extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton openbottomsheet;
    ImageButton requestlist,donatelist,otherinfo,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);
        openbottomsheet = findViewById(R.id.openbottomsheet);
        requestlist = findViewById(R.id.requestlist);
        donatelist = findViewById(R.id.donatelist);
        otherinfo = findViewById(R.id.otherinfo);
        profile = findViewById(R.id.profile);
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

        requestlist.setOnClickListener(this);
        donatelist.setOnClickListener(this);
        otherinfo.setOnClickListener(this);
        profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.requestlist:
                DashboardFragment requestFormFragment= new DashboardFragment();
                Utils.setDashboardFragment(requestFormFragment,getSupportFragmentManager());
                break;
            case R.id.donatelist:
                DonateFragment formFragment= new DonateFragment();
                Utils.setDashboardFragment(formFragment,getSupportFragmentManager());
                break;
            case R.id.otherinfo:
                OtherInfoFragment otherInfoFormFragment= new OtherInfoFragment();
                Utils.setDashboardFragment(otherInfoFormFragment,getSupportFragmentManager());
                break;
            case R.id.profile:
                ProfileFragment profileFragment= new ProfileFragment();
                Utils.setDashboardFragment(profileFragment,getSupportFragmentManager());
                break;

        }
    }
}