package com.covidaid.Fragement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.covidaid.FormContainerActivity;
import com.covidaid.R;
import com.covidaid.Utils.Utils;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetFragment extends BottomSheetDialogFragment implements View.OnClickListener {
    Button requestform,donateform,otherinfoform;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        requestform = view.findViewById(R.id.requestform);
        donateform = view.findViewById(R.id.donateform);
        otherinfoform = view.findViewById(R.id.otherinfoform);
        requestform.setOnClickListener(this);
        donateform.setOnClickListener(this);
        otherinfoform.setOnClickListener(this);
        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.requestform:
                Intent intent = new Intent(getContext(), FormContainerActivity.class);
                intent.putExtra("form", "requestform");
                startActivity(intent);
                dismiss();
                break;
            case R.id.donateform:
                Intent intent1 = new Intent(getContext(), FormContainerActivity.class);
                intent1.putExtra("form", "donateform");
                startActivity(intent1);

                dismiss();
                break;
            case R.id.otherinfoform:
                Intent intent2 = new Intent(getContext(), FormContainerActivity.class);
                intent2.putExtra("form", "otherinfoform");
                startActivity(intent2);

                dismiss();
                break;
        }
    }
}