package com.example.claire.boygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mainactivity extends AppCompatActivity {

    ImageView iv_tap;
    TextView tv_result, tv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);

        iv_tap = findViewById(R.id.iv_tap);
        tv_result = findViewById(R.id.tv_result);
        tv_info = findViewById(R.id.tv_info);
    }
}
