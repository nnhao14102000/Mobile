package dev.nnhao.designview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToComplete(View view) {
        Intent intent = new Intent(this, AutoCompleteActivity.class);
        startActivity(intent);
    }

    public void clickToTimer(View view) {

    }

    public void clickToSingle(View view) {

    }

    public void clickToMulti(View view) {

    }

    public void clickToSpinner(View view) {

    }

    public void clickToListFragment(View view) {

    }

    public void clickToDialogFragment(View view) {

    }

    public void clickToPreferenceFragment(View view) {

    }
}