package com.task.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IncrementValueBy1Activity extends AppCompatActivity {

    Button btnIncreaseValue, btnDecreaseValue;
    TextView txtIntegerNumber;
    //  Context context;
    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increment_value_by1);

        txtIntegerNumber = (TextView) findViewById(R.id.txtIntegerNumber);
        btnIncreaseValue = (Button) findViewById(R.id.btnIncreaseValue);
        // context=this;
        btnIncreaseValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter + 1;
            //    txtIntegerNumber.setText(counter);
                txtIntegerNumber.setText(String.valueOf(counter));

               Log.e("Size+", counter + "");
                if (counter > 10) {

                    Toast.makeText(IncrementValueBy1Activity.this, "You can Not Increase Text Size More than 10", Toast.LENGTH_SHORT).show();
                    btnIncreaseValue.setEnabled(false);


                }
            }
        });
        btnDecreaseValue = (Button) findViewById(R.id.btnDecreaseValue);
        btnDecreaseValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter = counter - 1;
                txtIntegerNumber.setText(String.valueOf(counter));
               // txtIntegerNumber.setText(counter);

                Log.e("Size-", counter + "");
                if (counter < 1) {

                    Toast.makeText(IncrementValueBy1Activity.this, "You can Not Increase Text Size More than 10", Toast.LENGTH_SHORT).show();
                    btnDecreaseValue.setEnabled(false);


                }


            }
        });


    }
}
