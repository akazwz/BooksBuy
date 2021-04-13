package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_5);
        Button sumingshoucang = (Button) findViewById(R.id.sumingshoucang);
        sumingshoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_5Activity.this,"《宿命》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button suminggoumai = (Button) findViewById(R.id.suminggoumai);
        suminggoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_5Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
