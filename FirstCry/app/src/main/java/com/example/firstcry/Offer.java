package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Offer extends AppCompatActivity {

    private ImageView itemImage1, itemImage2, itemImage3, itemImage4, itemImage5,itemImage6, itemImage7, itemImage8;
    private ImageView itemImage9, itemImage10, itemImage11, itemImage12, itemImage13, itemImage14, itemImage15, itemImage16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
        itemImage1=findViewById(R.id.offer1);
        itemImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //2
        itemImage2=findViewById(R.id.offer2);
        itemImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //3
        itemImage3=findViewById(R.id.offer3);
        itemImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //4
        itemImage4=findViewById(R.id.offer4);
        itemImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //5
        itemImage5=findViewById(R.id.offer5);
        itemImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //6
        itemImage6=findViewById(R.id.offer6);
        itemImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //7
        itemImage7=findViewById(R.id.offer7);
        itemImage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //8
        itemImage8=findViewById(R.id.offer8);
        itemImage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //9
        itemImage9=findViewById(R.id.offer9);
        itemImage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //10
        itemImage10=findViewById(R.id.offer10);
        itemImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //11
        itemImage11=findViewById(R.id.offer11);
        itemImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //12
        itemImage12=findViewById(R.id.offer12);
        itemImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //13
        itemImage13=findViewById(R.id.offer13);
        itemImage13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //14
        itemImage14=findViewById(R.id.offer14);
        itemImage14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //15
        itemImage15=findViewById(R.id.offer15);
        itemImage15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //16
        itemImage16=findViewById(R.id.offer16);
        itemImage16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });
    }
}