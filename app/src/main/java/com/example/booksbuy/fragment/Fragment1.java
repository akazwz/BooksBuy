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
import android.widget.Toast;

import com.example.booksbuy.Book.Book_1Activity;
import com.example.booksbuy.Book.Book_2Activity;
import com.example.booksbuy.Book.Book_3Activity;
import com.example.booksbuy.Book.Book_4Activity;
import com.example.booksbuy.Book.Book_5Activity;
import com.example.booksbuy.Book.Book_6Activity;
import com.example.booksbuy.Book.XiaoshuoActivity;
import com.example.booksbuy.Book.XuanyiActivity;
import com.example.booksbuy.QiehuanActivity;
import com.example.booksbuy.R;

public class Fragment1 extends Fragment {




    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        Button btn_sousuo = (Button) view.findViewById(R.id.btn_sousuo);
        btn_sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"搜索功能正在完善",Toast.LENGTH_SHORT).show();
            }
        });
        ImageView mIv1 = (ImageView) view.findViewById(R.id.iv_1);
        mIv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Book_1Activity.class);
                startActivity(intent);
            }
        });
        ImageView mIv2 = (ImageView) view.findViewById(R.id.iv_2);
        mIv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), Book_2Activity.class);
                startActivity(intent2);
            }
        });
        ImageView mIv3 = (ImageView) view.findViewById(R.id.iv_3);
        mIv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), Book_3Activity.class);
                startActivity(intent3);
            }
        });
        ImageView mIv4 = (ImageView) view.findViewById(R.id.iv_4);
        mIv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), Book_4Activity.class);
                startActivity(intent4);
            }
        });
        ImageView mIv5 = (ImageView) view.findViewById(R.id.iv_5);
        mIv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(), Book_5Activity.class);
                startActivity(intent5);
            }
        });
        ImageView mIv6 = (ImageView) view.findViewById(R.id.iv_6);
        mIv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getActivity(), Book_6Activity.class);
                startActivity(intent6);
            }
        });
        Button btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentxy = new Intent(getActivity(), XuanyiActivity.class);
                startActivity(intentxy);
            }
        });
        Button btn_2 = (Button) view.findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentxs = new Intent(getActivity(), XiaoshuoActivity.class);
                startActivity(intentxs);
            }
        });
        Button btn_3 = (Button) view.findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_4 = (Button) view.findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_5 = (Button) view.findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_6 = (Button) view.findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_7 = (Button) view.findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_8 = (Button) view.findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });
        return view;


    }

}
