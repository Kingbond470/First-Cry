package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PaymentSuccessful extends AppCompatActivity {

    private ImageView paymentSuccess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successful);
        paymentSuccess=findViewById(R.id.paymentSuccess);
        Glide.with(this)
                .load("https://media1.giphy.com/media/tVFCT2uq9HL0M58KBd/giphy.gif?cid=790b76110202eb18857abfbb74931559137f940a67a95098&rid=giphy.gif&ct=g")
                .into(paymentSuccess);
    }
}