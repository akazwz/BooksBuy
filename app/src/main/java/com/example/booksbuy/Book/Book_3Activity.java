package com.example.booksbuy.Book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.booksbuy.R;

public class Book_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_3);
        Button sitongnashoucang = (Button) findViewById(R.id.sitongnashoucang);
        sitongnashoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_3Activity.this,"《斯通纳》已加入收藏",Toast.LENGTH_SHORT).show();

            }
        });
        Button sitongnagoumai = (Button) findViewById(R.id.sitongnagoumai);
        sitongnagoumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Book_3Activity.this,"此功能正在完善",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
