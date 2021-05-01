package com.covidaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.covidaid.Fragement.DonateFormFragment;
import com.covidaid.Fragement.OtherInfoFormFragment;
import com.covidaid.Fragement.RequestFormFragment;
import com.covidaid.Utils.Utils;

public class FormContainerActivity extends AppCompatActivity {
    String formstring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formstring = getIntent().getStringExtra("form");

        switch (formstring){
            case "requestform":
                RequestFormFragment requestFormFragment = new RequestFormFragment();
                Utils.setBottomSheetFragment(requestFormFragment,getSupportFragmentManager());
                break;
            case "donateform":
                DonateFormFragment donateFormFragment = new DonateFormFragment();
                Utils.setBottomSheetFragment(donateFormFragment,getSupportFragmentManager());
                break;
            case "otherinfoform":
                OtherInfoFormFragment otherInfoFormFragment = new OtherInfoFormFragment();
                Utils.setBottomSheetFragment(otherInfoFormFragment,getSupportFragmentManager());
                break;

        }







    }
}