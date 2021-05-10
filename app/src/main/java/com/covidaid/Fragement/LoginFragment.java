package com.covidaid.Fragement;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.covidaid.DashboardScreen;
import com.covidaid.R;

public class LoginFragment extends Fragment {

    Button loginbutton;
    ImageView imageView;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_login, container, false);
         loginbutton = view.findViewById(R.id.loginbutton);
         imageView = view.findViewById(R.id.image);
         loginbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v)
             {
                 startActivity(new Intent(getContext(), DashboardScreen.class));
             }
         });

          return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide   .with(this)
                .load(R.drawable.login)
                .into(imageView);
    }
}