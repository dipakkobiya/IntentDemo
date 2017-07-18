package com.task.demo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

//import com.flyingfood.delivery.R;
//import com.flyingfood.delivery.custom.AppConstants;
//import com.flyingfood.delivery.custom.PostServiceCall;
//import com.flyingfood.delivery.custom.PrefUtils;
//import com.flyingfood.delivery.model.CommonResponse;
//import com.google.gson.GsonBuilder;

public class CourierWeeklyAvaibilityActivity extends AppCompatActivity {

    private TextView txtSelectedDay, txtSunday, txtMonday, txtTuesday, txtWednesday, txtThursday, txtFriday, txtSaturday;
    private Button btnUpdate;
    private ImageView imgBack;
    private CheckBox chkbSunday, chkbMonday, chkbTuesday, chkbWednesday, chkbThursday, chkbFriday, chkbSaturday;
    private StringBuilder stringBuilder;
    private ArrayList<String> categoryIDList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_weekly_avaibility);


        categoryIDList = new ArrayList<>();


        chkbSunday = (CheckBox) findViewById(R.id.chkbSunday);
        chkbMonday = (CheckBox) findViewById(R.id.chkbMonday);
        chkbTuesday = (CheckBox) findViewById(R.id.chkbTuesday);
        chkbWednesday = (CheckBox) findViewById(R.id.chkbWednesday);
        chkbThursday = (CheckBox) findViewById(R.id.chkbThursday);
        chkbFriday = (CheckBox) findViewById(R.id.chkbFriday);
        chkbSaturday = (CheckBox) findViewById(R.id.chkbSaturday);

        // txtSelectedDay = (TextView) findViewById(R.id.txtSelectedDay);
        txtSunday = (TextView) findViewById(R.id.txtSunday);
        txtMonday = (TextView) findViewById(R.id.txtMonday);
        txtTuesday = (TextView) findViewById(R.id.txtTuesday);
        txtWednesday = (TextView) findViewById(R.id.txtWednesday);
        txtThursday = (TextView) findViewById(R.id.txtThursday);
        txtFriday = (TextView) findViewById(R.id.txtFriday);
        txtSaturday = (TextView) findViewById(R.id.txtSaturday);

        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        imgBack = (ImageView) findViewById(R.id.imgBack);


        chkbSunday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Sunday");
                } else {

                    categoryIDList.remove("Sunday");
                }
            }
        });
        chkbMonday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Monday");
                } else {

                    categoryIDList.remove("Monday");
                }
            }
        });
        chkbTuesday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Tuesday");
                } else {

                    categoryIDList.remove("Tuesday");
                }
            }
        });
        chkbWednesday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Wednesday");
                } else {

                    categoryIDList.remove("Wednesday");
                }
            }
        });
        chkbThursday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Thursday");
                } else {

                    categoryIDList.remove("Thursday");
                }
            }
        });
        chkbFriday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Friday");
                } else {

                    categoryIDList.remove("Friday");
                }
            }
        });
        chkbSaturday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    categoryIDList.add("Saturday");
                } else {

                    categoryIDList.remove("Saturday");
                }
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (categoryIDList.size() == 0) {
                    Toast.makeText(CourierWeeklyAvaibilityActivity.this, "Please Select at least one category", Toast.LENGTH_SHORT).show();
                } else {
                    stringBuilder = new StringBuilder();
                    for (int i = 0; i < categoryIDList.size(); i++) {
                        //append the value into the builder
                        stringBuilder.append(categoryIDList.get(i));
                        if (i != categoryIDList.size() - 1) {
                            stringBuilder.append(",");
                        }
                    }


                }


                //  txtSelectedDay.setText(stringBuilder + "");

              //  doPostOperation();

            }
        });

      //  setToolbar();

    }


//    private void doPostOperation() {
//
//        if (isNetworkConnected()) {
//
//            final ProgressDialog progressDialog = new ProgressDialog(CourierWeeklyAvaibilityActivity.this);
//            progressDialog.setMessage("loading.....");
//            progressDialog.setCancelable(false);
//            progressDialog.show();
//
//
//            JSONObject registrationObject = new JSONObject();
//
//
//            try {
//                registrationObject.put("AvailableDays", stringBuilder);
//                registrationObject.put("UserId", PrefUtils.getUser(CourierWeeklyAvaibilityActivity.this).UserID + "");
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//            Log.e("login request object", registrationObject + "");
//
//            new PostServiceCall(AppConstants.CourierWeeklyAvailable, registrationObject) {
//
//                @Override
//                public void response(String response) {
//                    progressDialog.dismiss();
//
//                    CommonResponse submitResponse = new GsonBuilder().create().fromJson(response, CommonResponse.class);
//
//                    if (submitResponse.ResponseCode.equalsIgnoreCase("1")) {
//                        Toast.makeText(CourierWeeklyAvaibilityActivity.this, submitResponse.ResponseMsg, Toast.LENGTH_LONG).show();
//
//                        finish();
//                    } else {
//                        Toast.makeText(CourierWeeklyAvaibilityActivity.this, submitResponse.ResponseMsg, Toast.LENGTH_LONG).show();
//                    }
//                    Log.e("login response...", response + "");
//                }
//
//                @Override
//                public void error(String error) {
//                    progressDialog.dismiss();
//                    Log.e("login response...", error + "");
//                }
//            }.call();
//
//        }
//
//    }


    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

//    private void setToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        if (toolbar != null) {
//            toolbar.setTitle("Week Avaibility");
//            setSupportActionBar(toolbar);
//            toolbar.setNavigationIcon(R.drawable.ic_back);
//            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    finish();
//                }
//            });
//        }
//    }

}
