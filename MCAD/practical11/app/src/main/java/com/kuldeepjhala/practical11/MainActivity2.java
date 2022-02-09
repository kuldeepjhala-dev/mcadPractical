package com.kuldeepjhala.practical11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import com.kuldeepjhala.practical11.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding activityMain2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(activityMain2Binding.getRoot());

        TextView sum =  activityMain2Binding.tvActivity2;

        Bundle extras = getIntent().getExtras();
        int value1 = extras.getInt("Value1");
        int value2 = extras.getInt("Value2");

        int valueFinal = value1+value2;

        sum.setText(String.valueOf(valueFinal));

    }
}