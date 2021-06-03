package extended.ui.formwidgetsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private Spinner spNationality;
    private String selectedSpinner;
    private TextView txtBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBirth = findViewById(R.id.txtBirth);
        final Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR) - 18;
        int mon = cal.get(Calendar.MONTH) - 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String date = day + "/" + mon + "/" + year;
        txtBirth.setText(date);

        spNationality = findViewById(R.id.spNationality);
        List<String> dataSrc = new ArrayList<>();
        dataSrc.add("Kinh");
        dataSrc.add("It nguoi");
        dataSrc.add("Nuoc Ngoai");
        dataSrc.add("Viet Kieu");
        dataSrc.add("Nhap Tich");
        ArrayAdapter<String> dataAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataSrc);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNationality.setAdapter(dataAdapter);
        spNationality.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSpinner = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void clickToChangeDate(View view) {
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void clickToRegister(View view) {
        Bundle bundle = new Bundle();

        EditText edtUser = findViewById(R.id.edtUsername);
        bundle.putString("username", edtUser.getText().toString());

        EditText edtPass = findViewById(R.id.edtPassword);
        bundle.putString("password", edtPass.getText().toString());

        EditText edtFull = findViewById(R.id.edtFullname);
        bundle.putString("fullname", edtFull.getText().toString());

        CheckBox chkMale = findViewById(R.id.chkMale);
        bundle.putBoolean("male", chkMale.isChecked());

        RadioGroup rdgStatus = findViewById(R.id.rdgStatus);
        int checkedItem = rdgStatus.getCheckedRadioButtonId();
        RadioButton rdo = findViewById(checkedItem);
        bundle.putString("status", rdo.getText().toString());

        txtBirth = findViewById(R.id.txtBirth);
        bundle.putString("birthday", txtBirth.getText().toString());

        bundle.putString("natinality", selectedSpinner);

        SeekBar sbExp = findViewById(R.id.sBExp);
        bundle.putInt("exp", sbExp.getProgress());

        ToggleButton tgSport = findViewById(R.id.tgbSport);
        bundle.putString("sport", tgSport.getText().toString());

        RatingBar rbRating = findViewById(R.id.rateBRate);
        bundle.putFloat("rating", rbRating.getRating());

        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("INFO", bundle);
        startActivity(intent);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        int mon = monthOfYear + 1;
        int day = dayOfMonth;
        txtBirth = findViewById(R.id.txtBirth);
        String date = day + "/" + mon + "/" + year;
        txtBirth.setText(date);

    }
}