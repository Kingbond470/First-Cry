package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AskUserActivity extends AppCompatActivity {

    private TextView tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_user);
        initViews();

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AskUserActivity.this,Login.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        tvSignIn=findViewById(R.id.tv_sign_in);
    }
}