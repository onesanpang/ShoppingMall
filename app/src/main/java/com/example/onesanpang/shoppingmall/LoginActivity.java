package com.example.onesanpang.shoppingmall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button but_getCode;
    private Button but_login;
    private EditText edit_number;
    private EditText edit_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        initView();
    }

    private void initView(){
        but_login = findViewById(R.id.login_but_login);
        but_getCode = findViewById(R.id.login_but_getcode);
        edit_number = findViewById(R.id.login_edit_number);
        edit_code = findViewById(R.id.login_edit_code);

        but_login.setOnClickListener(this);
        but_getCode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.login_but_login:
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                finish();
                break;
            case R.id.login_but_getcode:
                break;
            default:
                break;
        }
    }
}
