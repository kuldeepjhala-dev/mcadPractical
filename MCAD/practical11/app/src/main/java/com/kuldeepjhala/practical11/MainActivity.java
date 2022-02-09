package com.kuldeepjhala.practical11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.kuldeepjhala.practical11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        TextView t1 = activityMainBinding.tv1;
        TextView t2 = activityMainBinding.tv2;

        activityMainBinding.button.setOnClickListener( l->{
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("Value1",Integer.parseInt(String.valueOf(t1.getText())));
                    i.putExtra("Value2",Integer.parseInt(String.valueOf(t2.getText())));
                    startActivity(i);
                }
        );
    }
}