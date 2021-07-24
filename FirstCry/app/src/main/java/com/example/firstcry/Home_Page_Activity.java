package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import com.google.android.material.slider.Slider;

import java.util.List;

public class Home_Page_Activity extends AppCompatActivity {

    private ImageView ivCart;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initViews();

        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_Page_Activity.this,Cart.class);
                startActivity(intent);
            }
        });

    }

    private void initViews() {
        ivCart=findViewById(R.id.ivCart);
        searchView.findViewById(R.id.home_page_searchView);
    }
}