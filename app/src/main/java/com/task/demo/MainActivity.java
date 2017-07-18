package com.task.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.task.demo.intent.demo.IntentTypeActivity;
import com.task.demo.radiobutton.demo.RadioButtonDemoActivity;
import com.task.demo.toolbar.demo.ToolbarDemoActivity;

public class MainActivity extends AppCompatActivity {

    Button btnIntent,btnToolbar,btnRadioButton,btnCheckBox,btnIncremnetDecrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntent = (Button) findViewById(R.id.btnIntent);
        btnToolbar = (Button) findViewById(R.id.btnToolbar);
        btnRadioButton = (Button) findViewById(R.id.btnRadioButton);
        btnCheckBox = (Button) findViewById(R.id.btnCheckBox);
        btnIncremnetDecrement = (Button) findViewById(R.id.btnIncremnetDecrement);
        setToolbar();
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, IntentTypeActivity.class);
                startActivity(i);
                finish();

            }
        });
        btnIncremnetDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, IncrementValueBy1Activity.class);
                startActivity(i);
                finish();

            }
        });
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ToolbarDemoActivity.class);
                startActivity(i);
                finish();


            }
        });
        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RadioButtonDemoActivity.class);
                startActivity(i);
                finish();


            }
        });
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, CheckBoxDayActivity.class);
                startActivity(i);
                finish();


            }
        });

    }
    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Click Below For Demo");
            setSupportActionBar(toolbar);
//            toolbar.setNavigationIcon(R.drawable.ic_action_name);
//            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    finish();
//                }
//            });
        }
    }

}
