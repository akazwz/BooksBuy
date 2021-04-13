package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_6);
        Button xuwushoucang = (Button) findViewById(R.id.xuwushoucang);
        xuwushoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_6Activity.this,"《虚无的十字架》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button xuwugoumai = (Button) findViewById(R.id.xuwugoumai);
        xuwugoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_6Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
