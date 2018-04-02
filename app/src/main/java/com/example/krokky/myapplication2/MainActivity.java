package com.example.krokky.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et, et2, et3;
    TextView tv4;
    ImageView ImageView1;
    ImageView ImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        et3 = findViewById(R.id.editText3);
        tv4 = findViewById(R.id.tv4);
        ImageView1 = findViewById(R.id.imageView);
        ImageView2 = findViewById(R.id.imageView2);

    }

    public void Onclick1(View v) {

        ImageView1.setVisibility(View.VISIBLE);
        ImageView2.setVisibility(View.GONE);

    }

    public void onClick(View v) {
        if (et.getText().length() == 0 || et2.getText().length() == 0 || et3.getText().length() == 0)
            tv4.setText("请填写完整！！！");
        else {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("sendMes", et.getText().toString());
            startActivity(intent);
        }
    }
}

