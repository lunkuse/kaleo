package com.example.kaleo.ui.splash;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kaleo.MainActivity;
import com.example.kaleo.ui.login.SignInActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashScreenActivity.this, SignInActivity.class));
        finish();
    }
}