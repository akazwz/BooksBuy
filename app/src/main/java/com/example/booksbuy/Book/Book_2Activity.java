package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_2);
        Button baiyexingshoucang = (Button) findViewById(R.id.baiyexingshoucang);
        baiyexingshoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_2Activity.this,"《白夜行》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button baiyexinggoumai = (Button) findViewById(R.id.baiyexinggoumai);
        baiyexinggoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_2Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
