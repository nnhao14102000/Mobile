package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToInteraction(View view) {
        Intent intent = new Intent(this, InteractionActivity.class);
        startActivity(intent);
    }

    public void clickToAddDinamically(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }
}