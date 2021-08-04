package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.firstcry.Cart_Fragments.Cart_Items_Fragment;
import com.example.firstcry.ItemShowRecyclerView.ItemModel;

public class ItemDetails extends AppCompatActivity {

    private Button addToCart, buyNow;


    private ImageView ivWishlist, firstCryLogo;
    private LinearLayout ivNotification, ivCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        addToCart=findViewById(R.id.addToCart);
        buyNow=findViewById(R.id.buyNow);

        ivWishlist=findViewById(R.id.iv_wishlist_icon);
        firstCryLogo=findViewById(R.id.firstCryLogo);
        ivCart = findViewById(R.id.cart_counter);
        ivNotification=findViewById(R.id.notification_counter);

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ItemDetails.this,"Added to Cart",Toast.LENGTH_SHORT).show();
                    int iamgeId=PrefernceHelper.getIntFromPreference(ItemDetails.this,"imageId");
                    String name=PrefernceHelper.getStringFromPreference(ItemDetails.this,"name");
                    String ogPrice=PrefernceHelper.getStringFromPreference(ItemDetails.this,"ogPrice");
                    String cutPrice=PrefernceHelper.getStringFromPreference(ItemDetails.this,"cutPrice");
                    String offPercent=PrefernceHelper.getStringFromPreference(ItemDetails.this,"offPercent");
                    String date=PrefernceHelper.getStringFromPreference(ItemDetails.this,"date");
                ItemModel itemModel=new ItemModel(iamgeId,name,ogPrice,cutPrice,offPercent,date);
                Cart_Items_Fragment.itemList.add(itemModel);


            }
        });

        buyNow=findViewById(R.id.buyNow);
        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ItemDetails.this,"Enter Details",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ItemDetails.this,BuyDetails.class);
                startActivity(intent);
            }
        });





        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this,Wishlist.class);
                startActivity(intent);
            }
        });
        firstCryLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this,Cart.class);
                startActivity(intent);
            }
        });
        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this,Notification.class);
                startActivity(intent);
            }
        });

    }
}