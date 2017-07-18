package com.task.demo.toolbar.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.task.demo.R;

public class ToolbarDemoActivity extends AppCompatActivity {

    Button btnToolbarHome,btnToolbarArrow,btnToolbarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar_demo);
        btnToolbarHome = (Button) findViewById(R.id. btnToolbarHome);
        btnToolbarArrow = (Button) findViewById(R.id. btnToolbarArrow);
        btnToolbarMenu = (Button) findViewById(R.id. btnToolbarMenu);

        btnToolbarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ToolbarDemoActivity.this, ToolbarHomeActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnToolbarArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ToolbarDemoActivity.this, ToolbarBackArrowActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnToolbarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ToolbarDemoActivity.this, ToolbarOptionMenuActivity.class);
                startActivity(i);
                finish();
            }
        });

        setToolbar();
    }




    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Toolbar Demo");
            setSupportActionBar(toolbar);

        }
    }

}
