package extended.ui.formwidgetsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView username = findViewById(R.id.txtUsername);
        TextView password = findViewById(R.id.txtPassword);
        TextView fullname = findViewById(R.id.txtFullname);
        TextView male = findViewById(R.id.txtMale);
        TextView nationality = findViewById(R.id.txtNationality);
        TextView birthday = findViewById(R.id.txtBirthday);
        TextView sport = findViewById(R.id.txtSprot);
        TextView status = findViewById(R.id.txtStatus);
        TextView exp = findViewById(R.id.txtExperiment);
        TextView rating = findViewById(R.id.txtRate);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("INFO");
        username.setText("Username: " + bundle.getString("username"));
        password.setText("Password: " + bundle.getString("password"));
        fullname.setText("Fullname: " + bundle.getString("fullname"));
        boolean b = bundle.getBoolean("male");
        male.setText("Male: " + String.valueOf(b));
        status.setText("Status: " + bundle.getString("status"));
        birthday.setText("Birthday: " + bundle.getString("birthday"));
        nationality.setText("Nationality: " + bundle.getString("nationality"));
        int nExp = bundle.getInt("exp");
        exp.setText("Experiment: " + String.valueOf(nExp) + " years");
        sport.setText("Sport: " + bundle.getString("sport"));
        float fRate = bundle.getFloat("rating");
        rating.setText("Rating: " + String.valueOf(fRate));

        NumberPicker npYear = findViewById(R.id.npYear);
        npYear.setMaxValue(10);
        npYear.setMinValue(1);
        npYear.setWrapSelectorWheel(false);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Check your infomation carefully \n. Change bought year if any",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void clickToConfirm(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_custom_toast, findViewById(R.id.custom_toast_layout));

        TextView txtResult = layout.findViewById(R.id.txtYear);
        NumberPicker npYear = findViewById(R.id.npYear);
        txtResult.setText(npYear.getValue() + "");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        Button confirm = findViewById(R.id.btnConfirm);
        confirm.setEnabled(false);
    }

    public void clickToWebsite(View view) {
        Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
        startActivity(intent);
    }
}