package com.kuldeepjhala.practical10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kuldeepjhala.practical10.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.click.setOnClickListener( l->{
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);

                }
        );

    }
}