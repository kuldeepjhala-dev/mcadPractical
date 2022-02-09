package com.kuldeepjhala.practical7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    Pattern p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.button1);
        p1 = Pattern.compile(".+@.+\\.[a-z]+");
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub
                String s1 = et1.getText().toString();
                Matcher m = p1.matcher(s1);
                if(et1.getText().length()==0){
                    if(et2.getText().length()==0)
                    {
                        et1.setError("Field cannot be left blank.");
                        et2.setError("Field cannot be left blank.");
                    }
                }
            }
        });
    }
}