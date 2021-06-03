package dev.nnhao.designview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    private String[] suggestion = {
            "khanhkt", "Kieu Trong Khanh", "http://kieutrongkhanh.net","Mobile Programing", "Advanced Java", "XML", "Others"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                suggestion);

        AutoCompleteTextView txt = findViewById(R.id.autoName);
        txt.setThreshold(3);
        txt.setAdapter(adapter);

    }
}