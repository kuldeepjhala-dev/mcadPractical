package com.kuldeepjhala.practical13;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kuldeepjhala.practical13.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        EditText str = activityMainBinding.etToast;

        activityMainBinding.btDisplay.setOnClickListener(l -> {
            Toast toast = Toast.makeText(getApplicationContext(), str.getText().toString(), Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}