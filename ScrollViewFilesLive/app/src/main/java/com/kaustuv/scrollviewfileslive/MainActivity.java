package com.kaustuv.scrollviewfileslive;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    TextView tv1, tv2, tv3, tv4, tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = findViewById(R.id.scrollViewId);
        b1 = findViewById(R.id.b1Id);
        b2 = findViewById(R.id.b2Id);
        b3 = findViewById(R.id.b3Id);
        b4 = findViewById(R.id.b4Id);
        b5 = findViewById(R.id.b5Id);
        b6 = findViewById(R.id.b6Id);
        b7 = findViewById(R.id.b7Id);
        b8 = findViewById(R.id.b8Id);
        b9 = findViewById(R.id.b9Id);
        b10 = findViewById(R.id.b10Id);
        tv1 = findViewById(R.id.TextViewOne);
        tv2 = findViewById(R.id.TextViewTwo);
        tv3 = findViewById(R.id.TextViewThree);
        tv4 = findViewById(R.id.TextViewfour);
        tv5 = findViewById(R.id.TextViewFive);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0,tv1.getBottom());
                    }
                });
            }
        });
    }
}