package com.example.basicwidget_0609;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }

    public  void onTextSize(View view) {
        EditText ed = findViewById(R.id.editTextNumber);
        TextView tv = findViewById(R.id.textView2);


        if( ! "".equals(ed.getText())) {
            int size = Integer.parseInt(ed.getText().toString());
            // setTextSize()
            ((TextView)tv).setTextSize((float)size);

        }

    }

    public void onColorRed(View view) {
        TextView tv = findViewById(R.id.textView3);

        //색상 넣는 방법
//        tv.setTextColor(Color.RED);
        tv.setTextColor(Color.parseColor("#fc037b"));
//        tv.setTextColor(Color.rgb(252, 3, 123));


    }

    public void onColorBlue(View view) {
        TextView tv = findViewById(R.id.textView3);
        tv.setTextColor(Color.BLUE);
    }

    public void onFontStyle(View view) {
        TextView tv = findViewById(R.id.textView3);
//        tv.setTextSize((float)24);
        tv.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
        tv.setText("Return the text that TextView is displaying");
        tv.setSingleLine(true);

    }

}