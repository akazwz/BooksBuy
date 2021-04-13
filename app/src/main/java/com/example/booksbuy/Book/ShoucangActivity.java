package com.example.booksbuy.Book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.booksbuy.R;

public class ShoucangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoucang);
        ImageView sc_yunzhongji = (ImageView) findViewById(R.id.sc_yunzhongji);
        sc_yunzhongji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ShoucangActivity.this, Book_1Activity.class);
                startActivity(intent1);
            }
        });
        ImageView sc_baiyexing = (ImageView) findViewById(R.id.sc_baiyexing);
        sc_baiyexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ShoucangActivity.this, Book_2Activity.class);
                startActivity(intent2);
            }
        });
        ImageView sc_sitongna = (ImageView) findViewById(R.id.sc_sitongna);
        sc_sitongna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ShoucangActivity.this, Book_3Activity.class);
                startActivity(intent3);
            }
        });
        ImageView sc_jieyou = (ImageView) findViewById(R.id.sc_jieyou);
        sc_jieyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(ShoucangActivity.this, Book_4Activity.class);
                startActivity(intent4);
            }
        });
        ImageView sc_suming = (ImageView) findViewById(R.id.sc_suming);
        sc_suming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(ShoucangActivity.this, Book_5Activity.class);
                startActivity(intent5);
            }
        });
        ImageView sc_xuwu = (ImageView) findViewById(R.id.sc_xuwu);
        sc_xuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(ShoucangActivity.this, Book_6Activity.class);
                startActivity(intent6);
            }
        });

    }
}
