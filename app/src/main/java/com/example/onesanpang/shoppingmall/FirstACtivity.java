package com.example.onesanpang.shoppingmall;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FirstACtivity extends AppCompatActivity {

    private ImageView image;
    private String imageUrl = "https://i1.mifile.cn/a4/xmad_15453810333749_hDsXv.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);

        if (getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        initView();
        Glide.with(this).load(imageUrl).into(image);
        intentNext();
    }

    private void initView(){
        image = findViewById(R.id.first_image_logo);

    }

    private void intentNext(){
        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                startActivity(new Intent(FirstACtivity.this,LoginActivity.class));
                finish();
                return false;
            }
        }).sendEmptyMessageDelayed(0,3000);
    }

}
