package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        TextView label = findViewById(R.id.txtShow);
        TextView par = findViewById(R.id.txtParameter);

        Uri url = getIntent().getData();
        label.setText(url.toString());

        String sPar = url.getQueryParameter("username");
        par.setText("Value of username is " + sPar);
    }
}