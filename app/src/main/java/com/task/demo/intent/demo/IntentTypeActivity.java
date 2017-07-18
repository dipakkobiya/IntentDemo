package com.task.demo.intent.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.task.demo.R;

public class IntentTypeActivity extends AppCompatActivity {

    Button btnImplicitIntent,btnExplicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_type);

        btnImplicitIntent = (Button) findViewById(R.id.btnImplicitIntent);
        btnExplicitIntent = (Button) findViewById(R.id.btnExplicitIntent);

        btnImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IntentTypeActivity.this,ImplicitActivity.class);
                startActivity(i);
            }
        });
        btnExplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IntentTypeActivity.this,ExplicitActivity.class);
                startActivity(i);
            }
        });

    }
}
