package dev.nnhao.screenorentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getResources().getDisplayMetrics().widthPixels >
            getResources().getDisplayMetrics().heightPixels){
            Toast.makeText(this, "Screen switch to Landscape Mode", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Screen switch to Portrait Mode", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickToManual(View view) {
        Intent intent = new Intent(this, ManualActivity.class);
        startActivity(intent);
    }

    public void clickToAnchor(View view) {
        Intent intent = new Intent(this, AnchorActivity.class);
        startActivity(intent);
    }

    public void clickToUI(View view) {
        Intent intent = new Intent(this, UIProgrammaticActivity.class);
        startActivity(intent);
    }
}