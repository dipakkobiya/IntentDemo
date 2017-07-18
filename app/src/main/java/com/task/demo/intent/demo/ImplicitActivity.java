package com.task.demo.intent.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.task.demo.R;

public class ImplicitActivity extends AppCompatActivity {

    Button btnNext;
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        btnNext = (Button) findViewById(R.id.btnNext);
         etName = (EditText) findViewById(R.id.etName);



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etName.getText().toString();

                Intent i = new Intent(ImplicitActivity.this,DisplayOutputActivity.class);
                i.putExtra("Name",name);
                startActivity(i);
            }
        });



    }
}
