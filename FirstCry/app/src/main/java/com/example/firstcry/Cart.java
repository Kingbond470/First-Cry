package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.firstcry.Cart_Fragments.Cart_Items_Fragment;
import com.google.android.material.tabs.TabItem;

public class Cart extends AppCompatActivity {

    private ImageView ivWishlist, firstCryLogo;
    private LinearLayout ivNotification, ivCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

                Cart_Items_Fragment cart_items_fragment = new Cart_Items_Fragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.RelativeLayoutView,cart_items_fragment);
                fragmentTransaction.commit();


        initViews();

        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,Wishlist.class);
                startActivity(intent);
            }
        });
        firstCryLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,Cart.class);
                startActivity(intent);
            }
        });
        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,Notification.class);
                startActivity(intent);
            }
        });


    }

    private void initViews() {
        ivWishlist=findViewById(R.id.iv_wishlist_icon);
        firstCryLogo=findViewById(R.id.firstCryLogo);
        ivCart = findViewById(R.id.cart_counter);
        ivNotification=findViewById(R.id.notification_counter);
    }
}