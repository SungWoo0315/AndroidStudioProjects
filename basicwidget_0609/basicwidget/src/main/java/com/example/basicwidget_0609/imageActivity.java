package com.example.basicwidget_0609;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class imageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_layout);


        setTitle("이미지 보기");

        TextView tv = findViewById(R.id.textView4);
        RadioGroup rg = findViewById(R.id.radiogroup);
        RadioButton rb1 = findViewById(R.id.radioButton3);
        RadioButton rb2 = findViewById(R.id.radioButton4);
        RadioButton rb3 = findViewById(R.id.radioButton5);
        RadioButton rb4 = findViewById(R.id.radioButton6);

        //추가 라디오그룹 및 버튼
        RadioGroup rg2 = findViewById(R.id.radiogroup2);
//        RadioButton rb5 = findViewById(R.id.radioButton7);
//        RadioButton rb6 = findViewById(R.id.radioButton8);
//        RadioButton rb7 = findViewById(R.id.radioButton9);
//        RadioButton rb8 = findViewById(R.id.radioButton10);

        CheckBox chkAgree = findViewById(R.id.checkBox6);
        Button btnOk = findViewById(R.id.button5);
//        Button btnOk2 = findViewById(R.id.button5);
        ImageView iv = findViewById(R.id.imageView5);

        iv.setScaleType((ImageView.ScaleType.FIT_CENTER));

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.radioButton3:
                        iv.setImageResource(R.drawable.puppy1);
                        break;
                    case R.id.radioButton4:
                        iv.setImageResource(R.drawable.puppy2);
                        break;
                    case R.id.radioButton5:
                        iv.setImageResource(R.drawable.puppy3);
                        break;
                    case R.id.radioButton6:
                        iv.setImageResource(R.drawable.puppy_beagle);
                        break;
                }
            }

        });



//        btnOk2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                switch (rg2.getCheckedRadioButtonId()) {
//                    case R.id.radioButton7:
//                        iv.setScaleType((ImageView.ScaleType.FIT_XY));
//                        break;
//                    case R.id.radioButton8:
//                        iv.setScaleType((ImageView.ScaleType.FIT_START));
//                        break;
//                    case R.id.radioButton9:
//                        iv.setScaleType((ImageView.ScaleType.FIT_END));
//                        break;
//                    case R.id.radioButton10:
//                        iv.setScaleType((ImageView.ScaleType.FIT_CENTER));
//                        break;
//                }
//            }
//        });



        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    tv.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    rg2.setVisibility(View.VISIBLE);    // 라디오 추가
                    btnOk.setVisibility(View.VISIBLE);
                    iv.setVisibility(View.VISIBLE);

                } else {
                    tv.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    rg2.setVisibility(View.INVISIBLE);  // 라디오 추가
                    btnOk.setVisibility(View.INVISIBLE);
                    iv.setVisibility(View.INVISIBLE);
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.radioButton7: //fixedXY
                        iv.setScaleType(ImageView.ScaleType.FIT_XY);
                        break;
                    case R.id.radioButton8:
                        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        break;
                    case R.id.radioButton9:
                        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        break;
                    case R.id.radioButton10:
                        iv.setScaleType(ImageView.ScaleType.CENTER);
                        break;
                }
            }
        });


    }
}