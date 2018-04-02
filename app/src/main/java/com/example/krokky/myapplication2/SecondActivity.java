package com.example.krokky.myapplication2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.marquee.dingrui.marqueeviewlib.MarqueeView;

public class SecondActivity extends AppCompatActivity {

    MarqueeView marqueeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().hide();//去掉标题栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);// 设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        marqueeView = findViewById(R.id.marquee);
        String date = getIntent().getStringExtra("sendMes");
        if (date != null) {
            marqueeView.setContent(("欢迎用户"+date+"  "+"Welcome user "+date+"  "));
        }
    }
}
