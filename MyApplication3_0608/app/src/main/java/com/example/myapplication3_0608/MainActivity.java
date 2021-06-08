package com.example.myapplication3_0608;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int o1 = 0;
    int o2 = 0;
    int o3 = 0;
    int o4 = 0;
    int o5 = 0;
    int o6 = 0;
    int o7 = 0;
    int o8 = 0;
    int o9 = 0;


    int op = -1; // 0: +, 1: -, 3: *, 4: /

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusmius = findViewById(R.id.button13);
        Button plus = findViewById(R.id.button12);
        Button mius = findViewById(R.id.button8);
        Button multi = findViewById(R.id.button4);
        Button enter = findViewById(R.id.button16);

        Button n1 = findViewById(R.id.button9);
        Button n2 = findViewById(R.id.button10);
        Button n3 = findViewById(R.id.button11);
        Button n4 = findViewById(R.id.button5);
        Button n5 = findViewById(R.id.button6);
        Button n6 = findViewById(R.id.button7);
        Button n7 = findViewById(R.id.button);
        Button n8 = findViewById(R.id.button2);
        Button n9 = findViewById(R.id.button3);


        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o1 = Integer.valueOf(n1.getText().toString());  //1;
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o2 = 2;
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o3 = 3;
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o4 = 4;
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o5 = 5;
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o6 = 6;
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o7 = 7;
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o8 = 8;
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o9 = 9;
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 0;
            }
        });

        mius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 1;
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 3;
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.textView);
                if (op == 0) {//plus
                    tv.setText("" + (o1 + o3));
                } else if (op == 1) {//mius
                    tv.setText("" + (o1 - o3));
                } else if (op == 3) {//multi
                    tv.setText("" + (o1 * o3));
                }
            }
        });


    }
}
