package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.firstcry.Cart_Fragments.Cart_Items_Fragment;
import com.google.android.material.tabs.TabItem;

public class Cart extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

                Cart_Items_Fragment cart_items_fragment = new Cart_Items_Fragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.RelativeLayoutView,cart_items_fragment);
                fragmentTransaction.commit();

    }
}