package dev.nnhao.screenorentation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class UIProgrammaticActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_uiprogrammatic);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);

        TextView txt = new TextView(this);
        txt.setText("Creating the UI Programmatically");
        txt.setId(R.string.title_control_UI);
        txt.setLayoutParams(params);

        Button button = new Button(this);
        button.setText("Click Here to show message");
        button.setLayoutParams(params);

        linear.addView(txt);
        linear.addView(button);

        this.addContentView(linear, params);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt = findViewById(R.string.title_control_UI);
                Toast.makeText(getApplicationContext(), txt.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}