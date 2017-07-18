package com.task.demo.intent.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.task.demo.R;

public class ExplicitActivity extends AppCompatActivity {

    Button btnCall,btnShareApp,btnRateApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        btnCall= (Button) findViewById(R.id.btnCall);
        btnShareApp= (Button) findViewById(R.id.btnShareApp);
        btnRateApp= (Button) findViewById(R.id.btnRateApp);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExplicitActivity.this,ExplicitCallActivity.class);
                startActivity(i);

            }
        });
        btnShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share();

            }
        });

        btnRateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.example.android"));
                startActivity(intent);

            }
        });

    }
    private void share() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
       startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }



}
