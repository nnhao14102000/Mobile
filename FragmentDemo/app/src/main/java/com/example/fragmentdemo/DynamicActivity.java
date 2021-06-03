package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction trans = manager.beginTransaction();
//
//        WindowManager window = getWindowManager();
//        Display d = window.getDefaultDisplay();
//
//        if(d.getWidth() > d.getHeight()) {
//            DynamicFragment1 main = new DynamicFragment1();
//            trans.replace(R.id.mainContainer, main);
//        }else{
//            DynamicFragment2 second = new DynamicFragment2();
//            trans.replace(R.id.mainContainer, second);
//        }
//        trans.commit();
    }


}