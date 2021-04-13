package com.example.booksbuy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booksbuy.Book.Book_1Activity;
import com.example.booksbuy.Book.Book_2Activity;
import com.example.booksbuy.Book.Book_3Activity;
import com.example.booksbuy.Book.Book_4Activity;
import com.example.booksbuy.Book.Book_5Activity;
import com.example.booksbuy.Book.Book_6Activity;
import com.example.booksbuy.QiehuanActivity;
import com.example.booksbuy.R;

public class Fragment3 extends Fragment {




    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,container,false);
        TextView shuzhaiyunzhongji = (TextView) view.findViewById(R.id.shuzhaiyunzhongji);
        shuzhaiyunzhongji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Book_1Activity.class);
                startActivity(intent);
            }
        });
        TextView shuzhaibaiyexing = (TextView) view.findViewById(R.id.shuzhaibaiyexing);
        shuzhaibaiyexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), Book_2Activity.class);
                startActivity(intent2);
            }
        });
        TextView shuzhaisitongna = (TextView) view.findViewById(R.id.shuzhaisitongna);
        shuzhaisitongna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), Book_3Activity.class);
                startActivity(intent3);
            }
        });
        TextView shuzhaijieyou = (TextView) view.findViewById(R.id.shuzhaijieyou);
        shuzhaijieyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), Book_4Activity.class);
                startActivity(intent4);
            }
        });
        TextView shuzhaisuming = (TextView) view.findViewById(R.id.shuzhaisuming);
        shuzhaisuming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(), Book_5Activity.class);
                startActivity(intent5);
            }
        });
        TextView shuzhaixuwu = (TextView) view.findViewById(R.id.shuzhaixuwu);
        shuzhaixuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getActivity(), Book_6Activity.class);
                startActivity(intent6);
            }
        });
        return view;


    }

}
