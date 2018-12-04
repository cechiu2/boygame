package com.example.claire.boygame;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mainactivity extends AppCompatActivity {

    ImageView iv_tap;
    TextView tv_result, tv_info;

    int currentTaps = 0;
    boolean gameStarted = false;

    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);

        iv_tap = findViewById(R.id.iv_tap);
        tv_result = findViewById(R.id.tv_result);
        tv_info = findViewById(R.id.tv_info);

        iv_tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameStarted) {
                    //count the taps if the game is started
                    currentTaps++;
                } else {
                    //start the game
                    gameStarted = true;
                }
            }
        });

        //timer for 10 seconds with interval 1 second
        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //display the remaining time
                tv_result.setText("Time Remaining: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                gameStarted = false;
                tv_info.setText("Game Over");
                tv_result.setText("Current Taps: " + currentTaps);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        iv_tap.setEnabled(true);
                        tv_info.setText("Start Tapping");
                    }
                }, 2000);
            }
        };
    }
}
