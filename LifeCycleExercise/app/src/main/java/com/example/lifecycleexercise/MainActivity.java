package com.example.lifecycleexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate is invoke!!!");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart is invoke!!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart is invoke!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume is invoke!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause is invoke!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop is invoke!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy is invoke!!!");
    }
}