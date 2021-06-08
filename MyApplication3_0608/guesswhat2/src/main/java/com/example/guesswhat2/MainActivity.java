package com.example.guesswhat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Button btn = (Button)view;
            int k = Integer.parseInt(btn.getText().toString());

            if (k == nRand) {
                Toast.makeText(MainActivity.this,
                        "OK anwer is " + k + "입니다.",
                        Toast.LENGTH_SHORT).show();
            } else {
                view.setVisibility(View.INVISIBLE);
            }

        }
    };

    Button[] buttons = new Button[20];
    int randNum[] = new int[20]; // 20개 임의의 숫자: 15 0 1 10 ~~~
    private int nRand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswhat_layout2);

        // 버튼 리스너 초기화.

        Resources res = getResources(); // res
        for (int i = 1; i <= 20; i++) {
            // Refelction
            int id = res.getIdentifier("button" + i,  // 이름
                    "id",                            // 종류
                    getClass().getPackage().getName());     // 패키지 이름
            buttons[i-1] = findViewById(id); // R.id.button1
            buttons[i-1].setOnClickListener(btnListener);
        }

        // 시작 버튼의 초기화.
        Button btn_start = findViewById(R.id.button_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. 난수 초기화 (게임 숫자)
                nRand = getRandomRange(1, 20);


                //2. 20개 임의이 숫자 발급
                for (int i = 0; i <20; i++){
                    randNum[i] = getRandomRange(1,20);
                    for (int k = 0; k < i; k++) {
                        if (randNum[i] == randNum[k]) {
                            randNum[i] = getRandomRange(1, 20);
                            k = -1; // break
                        }
                    }
                        //3. 20개 숫자를 버튼 텍스트 전환
                        buttons[i].setVisibility(View.VISIBLE);
                        buttons[i].setText("" + randNum[i]);


                }



            }
        });



    }



    private int getRandomRange(int strart, int end) {
        return (int)(Math.random() * 20 + 10);
    }

}