package com.example.d03_3_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int x = 0;
    int y = 0;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        y++;
        TextView res = (TextView) findViewById(R.id.Output);
        TextView res1 = (TextView) findViewById(R.id.output6);
        Button bu = (Button) findViewById(view.getId());
        Random rd = new Random();

        int re = rd.nextInt((6)+1);

        if(bu.getText().toString().equals(String.valueOf(re))){
            res.setText("폭탄입니당 펑펑");
            x++;
        }
        else {
            res.setText("폭탄이 아닙니다");
        }
        res1.setText(String.valueOf(((x*1.0)/y) * 100) + "%");

    }


}