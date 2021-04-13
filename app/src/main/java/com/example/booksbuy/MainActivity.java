package com.example.booksbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.booksbuy.fragment.Fragment1;
import com.example.booksbuy.fragment.Fragment2;
import com.example.booksbuy.fragment.Fragment3;
import com.example.booksbuy.fragment.Fragment4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(Fragment1.class,
                        "首页",
                        R.drawable.item1_before,
                        R.drawable.item1_after)
                .addItem(Fragment2.class,
                        "商店",
                        R.drawable.item2_before,
                        R.drawable.item2_after)
                .addItem(Fragment3.class,
                        "书摘",
                        R.drawable.item3_before,
                        R.drawable.item3_after)
                .addItem(Fragment4.class,
                        "我的",
                        R.drawable.item4_before,
                        R.drawable.item4_after)

                .build();

    }
}
