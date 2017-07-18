package com.task.demo.checkbox.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.task.demo.R;

public class CheckBoxDemoActivity extends AppCompatActivity {

    CheckBox chkbAndroid, chkbJava, chkbPhp, chkbPython;
    Button btnSubmit;
    TextView txtselectedLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);
        chkbAndroid = (CheckBox) findViewById(R.id.chkbAndroid);
        chkbJava = (CheckBox) findViewById(R.id.chkbJava);
        chkbPhp = (CheckBox) findViewById(R.id.chkbPhp);
        chkbPython = (CheckBox) findViewById(R.id.chkbPython);
        txtselectedLanguage = (TextView) findViewById(R.id.txtselectedLanguage);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtselectedLanguage.setText("");
                if(chkbAndroid.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" "+ chkbAndroid.getText().toString());
                }
                if(chkbJava.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" , "+ chkbJava.getText().toString());
                }
                if(chkbPhp.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+" , "+ chkbPhp.getText().toString());
                }
                if(chkbPython.isChecked()) {
                    txtselectedLanguage.setText(txtselectedLanguage.getText().toString()+"  "+ chkbPython.getText().toString());
                }

            }
        });
        setToolbar();
    }
    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Chekbox Demo");
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.drawable.ic_action_name);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
