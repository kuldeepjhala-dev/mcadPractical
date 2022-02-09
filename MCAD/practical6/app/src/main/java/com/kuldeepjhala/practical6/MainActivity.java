package com.kuldeepjhala.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.kuldeepjhala.practical6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        EditText usernameEditText = activityMainBinding.username;
        EditText passwordEditText = activityMainBinding.password;

        String emailid = "123@gmail.com";
        String password = "123";

        activityMainBinding.login.setOnClickListener(l -> {
                    if (emailid.equals(usernameEditText.toString()) && password.equals(passwordEditText.toString())) {
                        Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Login Fail", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}