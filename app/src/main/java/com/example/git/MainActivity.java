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
    }
}
