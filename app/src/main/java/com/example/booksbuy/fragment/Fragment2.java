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
import android.widget.Toast;

import com.example.booksbuy.Book.Book_1Activity;
import com.example.booksbuy.Book.Book_2Activity;
import com.example.booksbuy.Book.Book_3Activity;
import com.example.booksbuy.Book.Book_4Activity;
import com.example.booksbuy.Book.Book_5Activity;
import com.example.booksbuy.Book.Book_6Activity;
import com.example.booksbuy.Book.XiaoshuoActivity;
import com.example.booksbuy.Book.XuanyiActivity;
import com.example.booksbuy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        ImageView tj_yunzhongji = (ImageView) view.findViewById(R.id.tj_yunzhongji);
        tj_yunzhongji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), Book_1Activity.class);
                startActivity(intent1);
            }
        });
        ImageView tj_baiyexing = (ImageView) view.findViewById(R.id.tj_baiyexing);
        tj_baiyexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), Book_2Activity.class);
                startActivity(intent2);
            }
        });
        ImageView tj_sitongna = (ImageView) view.findViewById(R.id.tj_sitongna);
        tj_sitongna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), Book_3Activity.class);
                startActivity(intent3);
            }
        });
        ImageView rm_jieyou = (ImageView) view.findViewById(R.id.rm_jieyou);
        rm_jieyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), Book_4Activity.class);
                startActivity(intent4);
            }
        });
        ImageView rm_suming = (ImageView) view.findViewById(R.id.rm_suming);
        rm_suming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(), Book_5Activity.class);
                startActivity(intent5);
            }
        });
        ImageView rm_xuwu = (ImageView) view.findViewById(R.id.rm_xuwu);
        rm_xuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getActivity(), Book_6Activity.class);
                startActivity(intent6);
            }
        });
        Button btn_flxy = (Button) view.findViewById(R.id.btn_flxy);
        btn_flxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentxy = new Intent(getActivity(), XuanyiActivity.class);
                startActivity(intentxy);
            }
        });
        Button btn_flxs = (Button) view.findViewById(R.id.btn_flxs);
        btn_flxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentxs = new Intent(getActivity(), XiaoshuoActivity.class);
                startActivity(intentxs);
            }
        });
        Button btn_flkh = (Button) view.findViewById(R.id.btn_flkh);
        btn_flkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"暂未收录",Toast.LENGTH_SHORT).show();
            }
        });






        return view;
    }
}



