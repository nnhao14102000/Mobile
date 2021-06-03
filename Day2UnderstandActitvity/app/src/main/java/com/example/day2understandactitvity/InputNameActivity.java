package com.example.day2understandactitvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);
    }

    public void onClickDoneInput(View view){
        Intent intent = this.getIntent();
        EditText name = (EditText) this.findViewById(R.id.edtName);
        intent.putExtra("fullname", name.getText().toString());
        this.setResult(RESULT_OK, intent);
        finish();
    }
}