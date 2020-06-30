package com.example.git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 200;
        int b = 200 - a;
        int c = a + b;
        Log.d("TAG", "onCreate: " + c);
        String sr1 = "1";
        String sr2 = "2";
        String sr3 = "3";
        Log.d("TAG", "onCreate: " + c);
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        int a1 = 10;
        int b2 = 20;
        int c3 = b + a;
    }
}
