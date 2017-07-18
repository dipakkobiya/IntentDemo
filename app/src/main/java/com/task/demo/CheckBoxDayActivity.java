package com.task.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxDayActivity extends AppCompatActivity {


    CheckBox chkbAndroid, chkbJava, chkbPhp;
    Button btnSubmit;
    TextView txtselectedLanguage,txtSunday,txtMonday,txtTuesday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        chkbAndroid = (CheckBox) findViewById(R.id.chkbAndroid);
        chkbJava = (CheckBox) findViewById(R.id.chkbJava);
        chkbPhp = (CheckBox) findViewById(R.id.chkbPhp);
        txtSunday = (TextView) findViewById(R.id.txtSunday);
        txtMonday = (TextView) findViewById(R.id.txtMonday);

        txtTuesday = (TextView) findViewById(R.id.txtTuesday);


        txtselectedLanguage = (TextView) findViewById(R.id.txtselectedLanguage);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtselectedLanguage.setText("");
                if(chkbAndroid.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" "+ txtSunday.getText().toString());
                }
                if(chkbJava.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" , "+ txtMonday.getText().toString());
                }
                if(chkbPhp.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" , "+ txtTuesday.getText().toString());
                }

            }
        });
    }
}
