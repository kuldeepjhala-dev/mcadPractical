package com.kuldeepjhala.practical12;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity {
    Spinner sp1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Spinner) findViewById(R.id.spinner1);
        img1 = (ImageView) findViewById(R.id.imageView1);
        sp1.setOnItemSelectedListener(new
                                              AdapterView.OnItemSelectedListener() {

                                                  @Override
                                                  public void onItemSelected(AdapterView<?> arg0, View
                                                          arg1,
                                                                             int arg2, long arg3) {
                                                      // TODO Auto-generated method stub
                                                      if (sp1.getSelectedItemId() == 0) {
                                                          img1.setImageResource(R.drawable.image1);
                                                      } else if (sp1.getSelectedItemId() == 1) {
                                                          img1.setImageResource(R.drawable.image2);
                                                      } else if (sp1.getSelectedItemId() == 2) {
                                                          img1.setImageResource(R.drawable.image3);
                                                      } else if (sp1.getSelectedItemId() == 3) {
                                                          img1.setImageResource(R.drawable.image3);
                                                      }
                                                  }

                                                  @Override
                                                  public void onNothingSelected(AdapterView<?> parent) {
                                                      // TODO Auto-generated method stub
                                                  }
                                              });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}