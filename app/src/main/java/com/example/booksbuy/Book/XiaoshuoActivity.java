package com.example.booksbuy.Book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.booksbuy.R;

public class XiaoshuoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaoshuo);
        ImageView xs_yunzhongji = (ImageView) findViewById(R.id.xs_yunzhongji);
        xs_yunzhongji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(XiaoshuoActivity.this, Book_1Activity.class);
                startActivity(intent1);
            }
        });
        ImageView xs_baiyexing = (ImageView) findViewById(R.id.xs_baiyexing);
        xs_baiyexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(XiaoshuoActivity.this, Book_2Activity.class);
                startActivity(intent2);
            }
        });
        ImageView xs_sitongna = (ImageView) findViewById(R.id.xs_sitongna);
        xs_sitongna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(XiaoshuoActivity.this, Book_3Activity.class);
                startActivity(intent3);
            }
        });
        ImageView xs_jieyou = (ImageView) findViewById(R.id.xs_jieyou);
        xs_jieyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(XiaoshuoActivity.this, Book_4Activity.class);
                startActivity(intent4);
            }
        });
        ImageView xs_suming = (ImageView) findViewById(R.id.xs_suming);
        xs_suming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(XiaoshuoActivity.this, Book_5Activity.class);
                startActivity(intent5);
            }
        });
        ImageView xs_xuwu = (ImageView) findViewById(R.id.xs_xuwu);
        xs_xuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(XiaoshuoActivity.this, Book_6Activity.class);
                startActivity(intent6);
            }
        });

    }
}
