package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 레이아웃 -> Java Code 화.
        // R class
        //  -R 클래스
        //      - 리소스 종류 클래스
        //          - 리소스 값.(상수로 정의)
        setContentView(R.layout.activity_main);

        // 버튼 : findViewById()
        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        TextView result = findViewById(R.id.textView2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("버튼 : " + (++count));
                Log.d("버튼", ""+count);

                result.setText("버튼 : " + (++count-1));

                //Toast
                Toast.makeText( MainActivity.this, "버튼 : " + (++count-1), Toast.LENGTH_LONG).show();

                Toast ts = Toast.makeText( MainActivity.this, "메세지", Toast.LENGTH_SHORT);
                ts.show();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("버튼2: " + (++count));
                Log.d("버튼2", ""+count);

                result.setText("버튼2 : " + (++count-1));



            }
        });


        // 체크박스 이벤트
        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }
        });

        Switch sw = findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });



        String str = (String) btn.getText();
        // Logcat 출력
        // System.out.println() --> Logcat
        Log.i("버튼", str);

        btn.setText("내 버튼!!!");

        str = (String) btn.getText();
        Log.i("버튼", str);
    }
}