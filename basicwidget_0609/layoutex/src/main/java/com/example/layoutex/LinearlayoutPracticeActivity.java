package com.example.layoutex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LinearlayoutPracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.linearlayout_);

        // 213p XML없이 코딩하기.

        // Parameter
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, //width
                LinearLayout.LayoutParams.MATCH_PARENT //height
        );

        LinearLayout layout = new LinearLayout(LinearlayoutPracticeActivity.this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.RED);

        setContentView(layout, params);

        Button btn = new Button(LinearlayoutPracticeActivity.this);
        Button btn2 = new Button(LinearlayoutPracticeActivity.this);
        btn.setText("버튼이다1");
        btn2.setText("버튼이다2");

        layout.addView(btn);
        layout.addView(btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LinearlayoutPracticeActivity.this,
                        "버튼1",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}