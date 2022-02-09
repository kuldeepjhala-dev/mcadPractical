package com.kuldeepjhala.practical14;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.kuldeepjhala.practical14.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.btn1.setOnClickListener(l->{
            activityMainBinding.tv.setTextColor(R.color.yellow);
        });

        activityMainBinding.btn2.setOnClickListener(l->{
            activityMainBinding.tv.setTextColor(R.color.red);
        });
    }
}