package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_4);
        Button jieyoushoucang = (Button) findViewById(R.id.jieyoushoucang);
        jieyoushoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_4Activity.this,"《解忧杂货店》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button jieyougoumai = (Button) findViewById(R.id.jieyougoumai);
        jieyougoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_4Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
