package com.example.git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         Log.d("TAG", "onCreate: "+c);
        String s1 = "1";
        String s2 = "2";
        String s3 = "3"; 
        int a = 10;
        int b = 20;
        int c = b + a;
              
    }
}
