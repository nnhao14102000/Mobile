package com.example.day2understandactitvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int INPUT_NAME_ACTIVITY = 1;

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

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart is invoke!!!");
    }

    public void onClickInputMain(View view){
        Intent intent = new Intent(this, InputNameActivity.class);
        startActivityForResult(intent, INPUT_NAME_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == INPUT_NAME_ACTIVITY){
            if(resultCode == RESULT_OK){
                String name = data.getStringExtra("fullname");
                TextView text = (TextView) findViewById(R.id.txtViewResult);
                text.setText("Welcome " + name + " to Activity Concept!");
            }
        }
    }
}