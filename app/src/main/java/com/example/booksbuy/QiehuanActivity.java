package com.example.booksbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.booksbuy.Book.Book_1Activity;

public class QiehuanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qiehuan);
        Button btn_mashangzhuce = (Button) findViewById(R.id.btn_mashangzhuce);
        btn_mashangzhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentzhuce = new Intent(QiehuanActivity.this ,ZhuceActivity.class);
                startActivity(intentzhuce);
            }
        });
        Button btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QiehuanActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
