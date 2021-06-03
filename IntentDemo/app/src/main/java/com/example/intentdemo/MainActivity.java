package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToCallOtherActivity(View view){
        Intent intent = new Intent(this, ChildActivity.class);
        startActivity(intent);
    }

    public void clickToAdd(View view){
        Intent intent = new Intent(this,ResultActivity.class);
        EditText n1 = findViewById(R.id.edtNum1);
        EditText n2 = findViewById(R.id.edtNum2);
        Bundle bundle = new Bundle();

        double num1 = Double.parseDouble(n1.getText().toString());
        double num2 = Double.parseDouble(n2.getText().toString());

        bundle.putDouble("num1", num1);
        bundle.putDouble("num2", num2);
        intent.putExtra("info",bundle);

        startActivity(intent);
    }

    public void clickToStartBrowser(View view){
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickToStartToBrowserLaunch(View view){
        Uri uri = Uri.parse("http://www.google.com?username=nnhao");
        Intent intent = new Intent("com.example.intentdemo.LAUNCH", uri);
        startActivity(intent);
    }

    public void clickToStartPhoneCall(View view){
        Uri uri = Uri.parse("tel:0123456789");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickToGetException(View view){
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent("com.example.intentdemo.LAUNCH", uri);
        startActivity(intent);
    }


}