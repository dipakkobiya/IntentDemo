package com.task.demo.toolbar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.task.demo.R;

public class RegistrationPageValidationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page_validation);

//        btnRegistration.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(etUsername.getText().toString().trim().length()==0){
//                    Toast.makeText(RegistrationActivity.this, "Please enter username", Toast.LENGTH_SHORT).show();
//                }else if(etEmail.getText().toString().trim().length()==0){
//                    Toast.makeText(RegistrationActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
//                }else if(!isValidEmail(etEmail.getText().toString().trim())){
//                    Toast.makeText(RegistrationActivity.this, "Please enter valid email", Toast.LENGTH_SHORT).show();
//                }else if(etPassword.getText().toString().trim().length()==0){
//                    Toast.makeText(RegistrationActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
//                }else if(etCPassword.getText().toString().trim().length()==0){
//                    Toast.makeText(RegistrationActivity.this, "Please enter confirm password", Toast.LENGTH_SHORT).show();
//                }else if(!etPassword.getText().toString().trim().equalsIgnoreCase(etCPassword.getText().toString().trim())){
//                    Toast.makeText(RegistrationActivity.this, "password didn't match", Toast.LENGTH_SHORT).show();
//                }else{
//                    doPostOperation();
//                }
//
//            }
//        });
    }

    private boolean isValidEmail(String email) {

        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

    }
    }

