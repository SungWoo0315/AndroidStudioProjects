package com.example.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout layout = findViewById(R.id.my_linearlayout);
                layout.setBackgroundColor(Color.TRANSPARENT);
            }
        });

    }


    public void onRed(View v) {
        LinearLayout layout = findViewById(R.id.my_linearlayout);
        layout.setBackgroundColor(Color.RED);
    }

    public void onBlue(View v) {
        LinearLayout layout = findViewById(R.id.my_linearlayout);
        layout.setBackgroundColor(Color.BLUE);
    }

    public void onGreen(View v) {
        LinearLayout layout = findViewById(R.id.my_linearlayout);
        layout.setBackgroundColor(Color.GREEN);
    }

    public void onRandom(View v) {
        LinearLayout layout = findViewById(R.id.my_linearlayout);

        //랜덤컬러 구현.
        Random random = new Random();
        int color = 0;
        color = Color.rgb(random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255));

        layout.setBackgroundColor(color);

        //RGB 추출 후. Toast 출력.
        int rgb = color;
        int r = Color.red(rgb);   //빨강
        int g = Color.green(rgb); //초록
        int b = Color.blue(rgb);  //파랑

        Toast.makeText(MainActivity.this, "RGB 값 : "+" R:"+r+" G:"+g+" B:"+b, Toast.LENGTH_SHORT).show();

//        Toast.makeText(MainActivity.this, "출력 컬러 : " + color, Toast.LENGTH_LONG).show();

    }




    public  void onHomepage(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public  void onPhone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel://1111-1111"));
        startActivity(intent);
    }

    public  void onGallery(View v) {

        // 갤러리.
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
//        startActivity(intent);


        // 지도.
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:35.80853, 128.539014")); //geo: 위도, 경도
        startActivity(intent);

    }

    public  void onFinish(View v) {
        finish();
    }

}