package com.task.demo.intent.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.task.demo.R;

public class DisplayOutputActivity extends AppCompatActivity {

    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_output);

        txtOutput = (TextView) findViewById(R.id.txtOutput);
        txtOutput.setText(getIntent().getStringExtra("Name"));


    }
}
