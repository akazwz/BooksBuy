package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_1);
        Button yunzhongjishoucang = (Button) findViewById(R.id.yunzhongjishoucang);
        yunzhongjishoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_1Activity.this,"《云中记》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button yunzhongjigoumai = (Button) findViewById(R.id.yunzhongjigoumai);
        yunzhongjigoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_1Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
