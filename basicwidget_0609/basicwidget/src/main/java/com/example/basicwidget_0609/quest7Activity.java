package com.example.basicwidget_0609;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quest7Activity extends AppCompatActivity {



    private boolean is_disabled = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest7);

        initUI(); //checked 설정 코드로 부여.

        RadioGroup rg = findViewById(R.id.radiogroup);
        RadioGroup rg2 = findViewById(R.id.radiogroup2);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                Button btn = findViewById(R.id.button6);

                switch (id) {
                    case R.id.radioButton11:
                        btn.setEnabled(true);
                        is_disabled = false;
                        break;
                    case R.id.radioButton12:
                        btn.setEnabled(false);
                        is_disabled = true;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                Button btn = findViewById(R.id.button6);

                if (!is_disabled) {


                    switch (id) {
                        case R.id.radioButton13:
                            btn.setRotation((float) 0);
                            break;
                        case R.id.radioButton14:
                            btn.setRotation((float) 45);
                            break;
                        case R.id.radioButton15:
                            btn.setRotation((float) 90);
                            break;
                        case R.id.radioButton16:
                            btn.setRotation((float) 135);
                            break;

                    }
                }
            }
        });
    }
        private void initUI() {
            RadioButton rb = findViewById(R.id.radioButton11);
            rb.setChecked(true);
            RadioButton rb2 = findViewById(R.id.radioButton13);
            rb.setChecked(true);


    }
}