package com.task.demo.radiobutton.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.task.demo.R;

public class RadioButtonDemoActivity extends AppCompatActivity {

    Button btnSubmit;
    RadioButton rdbMale, rdbFemale;
    String selectedGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);

        rdbMale = (RadioButton) findViewById(R.id.rdbMale);
        rdbFemale = (RadioButton) findViewById(R.id.rdbFemale);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rdbMale.isChecked()) {
                    selectedGender = rdbMale.getText().toString();
                } else if (rdbFemale.isChecked()) {
                    selectedGender = rdbFemale.getText().toString();
                }

                Toast.makeText(getApplicationContext(), selectedGender, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
