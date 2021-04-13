package com.example.booksbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.booksbuy.Book.Book_1Activity;

public class ZhuceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        EditText et_zhuceyouxiang = (EditText) findViewById(R.id.et_zhuceyouxiang);
        et_zhuceyouxiang.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        EditText et_zhuceshouji = (EditText) findViewById(R.id.et_zhuceshouji);
        et_zhuceshouji.setInputType(InputType.TYPE_CLASS_PHONE);
        Button btn_zhuce = (Button) findViewById(R.id.btn_zhuce);
        btn_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ZhuceActivity.this,"注册成功",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
