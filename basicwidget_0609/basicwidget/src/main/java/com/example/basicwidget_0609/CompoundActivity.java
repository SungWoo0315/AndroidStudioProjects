package com.example.basicwidget_0609;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CompoundActivity extends AppCompatActivity {

    CompoundButton.OnCheckedChangeListener myCheckedListner = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            int id = compoundButton.getId();
            CheckBox cb = (CheckBox) compoundButton;
            TextView tv = findViewById(R.id.textView);
            if (b == true) {
                switch (id) {
                    case R.id.checkBox4:
                        tv.setTextColor(Color.RED);
                        break;
                    case R.id.checkBox5:
                        tv.setTextColor(Color.BLUE);
                        break;
                }
            } else{
                tv.setTextColor(Color.GRAY);
            }

        }

//            CheckBox cb = (CheckBox)compoundButton;
//
//            if (b == true) {
//                Toast.makeText(CompoundActivity.this,
//                        ""+cb.getText()+ "is Checked!",
//                        Toast.LENGTH_SHORT)
//                        .show();
//            } else {
//                Toast.makeText(CompoundActivity.this,
//                        ""+cb.getText()+ "is Unchecked!",
//                        Toast.LENGTH_SHORT)
//                        .show();
//            }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        CheckBox cb4 = findViewById(R.id.checkBox4);
        CheckBox cb5 = findViewById(R.id.checkBox5);
        cb4.setOnCheckedChangeListener(myCheckedListner);
        cb5.setOnCheckedChangeListener(myCheckedListner);





        CheckBox cbAndroid = findViewById(R.id.checkBox);
        CheckBox cbIphone = findViewById(R.id.checkBox2);
        CheckBox cbHandphone = findViewById(R.id.checkBox3);

        cbIphone.setOnCheckedChangeListener(myCheckedListner);
        cbHandphone.setOnCheckedChangeListener(myCheckedListner);

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox cb = (CheckBox)compoundButton;

                if (b == true) {
                    Toast.makeText(CompoundActivity.this,
                            ""+cb.getText()+ "is Checked!",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(CompoundActivity.this,
                            ""+cb.getText()+ "is Unchecked!",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        RadioGroup rg = findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.radioButton:
                        Toast.makeText(CompoundActivity.this,
                                "남성 : "+id,
                                Toast.LENGTH_SHORT)
                                .show();
                        break;
                    case  R.id.radioButton2:
                        Toast.makeText(CompoundActivity.this,
                                "여성 : "+id,
                                Toast.LENGTH_SHORT)
                                .show();
                        break;
                }


            }
        });









    }


    public void onHandphone(View v) {
        CheckBox cb = (CheckBox)v;

        Toast.makeText(CompoundActivity.this,
                ""+cb.getText(),
                Toast.LENGTH_SHORT)
                .show();
    }

}