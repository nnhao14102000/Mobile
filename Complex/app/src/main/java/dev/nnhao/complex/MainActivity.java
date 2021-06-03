package dev.nnhao.complex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    private boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.viewFlipper1);
        status = false;
    }

    public void clickPrevious(View view) {
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_in));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_out));
        viewFlipper.showPrevious();
    }

    public void clickNext(View view) {
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right_in));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_out));
        viewFlipper.showNext();
    }

    public void clickToAuto(View view) {
        Button btnAuto = findViewById(R.id.btnAuto);
        if(!status){
            viewFlipper.setAutoStart(true);
            viewFlipper.setFlipInterval(2000);
            viewFlipper.startFlipping();
            btnAuto.setText("Stop");
        }else{
            viewFlipper.stopFlipping();
            btnAuto.setText("Auto");
        }
        status =! status;
    }
}