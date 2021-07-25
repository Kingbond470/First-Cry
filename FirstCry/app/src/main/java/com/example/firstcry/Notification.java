package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Notification extends AppCompatActivity {

    private ImageView ivWishlist, firstCryLogo;
    private LinearLayout ivNotification, ivCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        initViews();

        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notification.this,Wishlist.class);
                startActivity(intent);
            }
        });
        firstCryLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notification.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notification.this,Cart.class);
                startActivity(intent);
            }
        });
        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notification.this,Notification.class);
                startActivity(intent);
            }
        });

    }

    private void initViews() {
        ivWishlist=findViewById(R.id.iv_wishlist_icon);
        firstCryLogo=findViewById(R.id.NotificationfirstCryLogo);
        ivCart = findViewById(R.id.cart_counter);
        ivNotification=findViewById(R.id.notification_counter);
    }


}