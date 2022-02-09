package com.kuldeepjhala.practical15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kuldeepjhala.practical15.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    String cars[]={
      "Verna","Elentra","Civic"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        ListView carslist = activityMainBinding.lvMain;

        ArrayAdapter<String> arr;

                arr = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
                cars);
        carslist.setAdapter(arr);

        carslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {

                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else if(position == 1)
                {
                    Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent2);
                } else if(position == 2){
                    Intent intent3 = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent3);
                }

            }
        });
    }
}