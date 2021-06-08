package com.example.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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