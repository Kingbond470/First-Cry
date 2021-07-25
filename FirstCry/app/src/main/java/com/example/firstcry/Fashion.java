package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Fashion extends AppCompatActivity {

    private ImageView ivMenuBar, ivWishlist, firstCryLogo;
    private LinearLayout ivNotification, ivCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);
        initViews();

        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this, Cart.class);
                startActivity(intent);
            }
        });

        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this, Notification.class);
                startActivity(intent);
            }
        });

        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this, Cart.class);
                startActivity(intent);
            }
        });
        firstCryLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        ivMenuBar = findViewById(R.id.menu_bar);
        ivNotification = findViewById(R.id.notification_counter);
        ivWishlist = findViewById(R.id.iv_wishlist_icon);
        ivCart = findViewById(R.id.cart_counter);
        firstCryLogo = findViewById(R.id.firstCryLogo);
    }
}