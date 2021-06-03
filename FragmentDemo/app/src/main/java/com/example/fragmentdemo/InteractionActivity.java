package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InteractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);
    }

    public void clickToCommunicate(View view) {
        TextView txt = findViewById(R.id.txtViewDyn1);
        Toast.makeText(this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}