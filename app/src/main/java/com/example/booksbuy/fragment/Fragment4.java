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

import com.example.booksbuy.Book.ShoucangActivity;
import com.example.booksbuy.QiehuanActivity;
import com.example.booksbuy.R;

public class Fragment4 extends Fragment {

    private Button mBtnqiehuan;



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4,container,false);
        Button btn_shezhi = (Button) view.findViewById(R.id.btn_shezhi);
        btn_shezhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"设置功能正在完善",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_goumai = (Button) view.findViewById(R.id.btn_goumai);
        btn_goumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"购买功能正在完善",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_xiugai = (Button) view.findViewById(R.id.btn_xiugai);
        btn_xiugai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"修改资料功能正在完善",Toast.LENGTH_SHORT).show();
            }
        });
        ImageView im_touxiang = (ImageView) view.findViewById(R.id.im_touxiang);
        im_touxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"功能正在完善",Toast.LENGTH_SHORT).show();
            }
        });



        Button mBtnqiehuan = (Button)view.findViewById(R.id.btn_qiehuan);
        mBtnqiehuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QiehuanActivity.class);
                startActivity(intent);
            }
        });
        Button btn_shoucang = (Button)view.findViewById(R.id.btn_shoucang);
        btn_shoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsc = new Intent(getActivity(), ShoucangActivity.class);
                startActivity(intentsc);
            }
        });
        return view;


    }

}
