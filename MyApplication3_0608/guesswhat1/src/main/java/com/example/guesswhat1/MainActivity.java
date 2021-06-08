package com.example.guesswhat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // 임의의 숫자;
    int nRnd = -1;

    // 입력 횟수
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswhat_layout1);

        // 10~30 사이의 임의의 숫자 생성.
//        nRnd = (int)(Math.random() * 20 + 10);
        nRnd = getRandomRange( 10, 30); //

        //1. 입력됐는지 : 숫자입력요구!!!
        //2. 입력 nRnd 비교
        //3. 횟수 카운팅!
        Button ok = findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTv = findViewById(R.id.result_txt);
                EditText ed = findViewById(R.id.editTextNumber);
                String str = ed.getText().toString();

                //1. 입력이 됐는지? - no: 숫자 입력 요구!!!
                if("".equals(str)) {
                    Toast.makeText(MainActivity.this,
                            "숫자를 입력해주세요.",
                            Toast.LENGTH_LONG).show();
                } else {
                    //2. 입력
                    //  - 비교: nRnd비교
                    String msg = null;
                    int p = Integer.parseInt(ed.getText().toString());
                    if(p <10 || p > 30) {
                        msg = "입력한 값이 10~30을 벗어났습니다.";
                    }
                    else if (p == nRnd) {
                        msg = counter + "번째에 맞추셨습니다.";
                    }
                    else if (p > nRnd) {
                        msg = p + "보다 작은 값입니다.";
                    }
                    else {
                        msg = p + "보다 큰 값입니다.  ";
                    }
                    resultTv.setText(msg);

                }
                //3. 횟수 카운팅.
                counter++;



                Toast.makeText(MainActivity.this,
                        "추측: " + nRnd,
                        Toast.LENGTH_SHORT).show();
            }
        });


        // 리셋 설정.
        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 임의의 수 발생
                nRnd = getRandomRange( 10, 30); //
                //2. 판정결과 텍스트 클리어
                TextView tv = findViewById(R.id.result_txt);
                tv.setText("");
                counter = 1;
            }
        });


    }

    private int getRandomRange(int strart, int end) {
        return (int)(Math.random() * 20 + 10);
    }



}


//              < 예제... >
//                double rnd = Math.random();
//
//                int int_rnd = (int)(Math.random() * 10);    // 0~9 사이 정수
//                int int_rnd2 = (int)(Math.random() * 10 + 1);    // 1~10 사이 정수
//                int int_rnd3 = (int)(Math.random() * 20 + 20);      // 20~40 사이 정수

//                Toast.makeText(MainActivity.this,
//                        "double = " + rnd + "\n int 0~9 = " + int_rnd
//                                + "\n int 1~10 = " + int_rnd2
//                                + "\n int 20~40 = " + int_rnd3,
//                        Toast.LENGTH_SHORT).show();