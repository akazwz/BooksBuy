package com.example.booksbuy.Book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.booksbuy.R;

public class XuanyiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuanyi);
        ImageView xy_baiyexing = (ImageView) findViewById(R.id.xy_baiyexing);
        xy_baiyexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(XuanyiActivity.this, Book_2Activity.class);
                startActivity(intent2);
            }
        });
        ImageView xy_jieyou = (ImageView) findViewById(R.id.xy_jieyou);
        xy_jieyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(XuanyiActivity.this, Book_4Activity.class);
                startActivity(intent4);
            }
        });
        ImageView xy_suming = (ImageView) findViewById(R.id.xy_suming);
        xy_suming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(XuanyiActivity.this, Book_5Activity.class);
                startActivity(intent5);
            }
        });
        ImageView xy_xuwu = (ImageView) findViewById(R.id.xy_xuwu);
        xy_xuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(XuanyiActivity.this, Book_6Activity.class);
                startActivity(intent6);
            }
        });
    }
}
