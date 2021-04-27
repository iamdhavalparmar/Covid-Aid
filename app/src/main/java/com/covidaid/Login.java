package com.covidaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Fade;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.covidaid.Fragement.LoginFragment;
import com.covidaid.Fragement.SignUp;
import com.covidaid.Utils.Utils;

public class Login extends AppCompatActivity {

    RadioGroup toggle;
    RadioButton login,signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        toggle = findViewById(R.id.radio_group);
        login = findViewById(R.id.login);
        signUp  = findViewById(R.id.signup);

        LoginFragment loginFragment = new LoginFragment();
        Utils.setMyFragment(loginFragment,getSupportFragmentManager());
        login.setTextColor(Color.WHITE);
        toggle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint({"NonConstantResourceId", "ResourceType"})
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.login:
                        login.setTextColor(Color.WHITE);
                        signUp.setTextColor(R.color.ligh_blue);
                        Toast.makeText(Login.this, "Login", Toast.LENGTH_SHORT).show();
                        LoginFragment loginFragment = new LoginFragment();
                        loginFragment.setSharedElementEnterTransition(new Utils.DetailsTransition());
                        loginFragment.setEnterTransition(new Fade());
                        loginFragment.setExitTransition(new Fade());
                        loginFragment.setSharedElementReturnTransition(new Utils.DetailsTransition());
                        Utils.setMyFragment(loginFragment, getSupportFragmentManager());
                        break;
                    case R.id.signup:
                        signUp.setTextColor(Color.WHITE);
                        login.setTextColor(R.color.ligh_blue);
                        Toast.makeText(Login.this, "SignUp", Toast.LENGTH_SHORT).show();
                        SignUp signUpfragment = new SignUp();
                        signUpfragment.setSharedElementEnterTransition(new Utils.DetailsTransition());
                        signUpfragment.setEnterTransition(new Fade());
                        signUpfragment.setExitTransition(new Fade());
                        signUpfragment.setSharedElementReturnTransition(new Utils.DetailsTransition());
                        Utils.setMyFragment(signUpfragment, getSupportFragmentManager());
                        break;
                }
            }
        });

    }
}