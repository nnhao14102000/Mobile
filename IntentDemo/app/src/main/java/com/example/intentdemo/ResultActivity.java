package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView text = findViewById(R.id.txtResult);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("info");
        double num1 = bundle.getDouble("num1");
        double num2 = bundle.getDouble("num2");
        double result = num1 + num2;
        text.setText(result + "");
    }

    public void clickToBackCaller(View view){
        finish();
    }
}