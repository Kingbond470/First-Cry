package com.example.firstcry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.firstcry.Cart_Fragments.Cart_Items_Fragment;
import com.example.firstcry.Shopping.Image_Model;
import com.example.firstcry.Shopping.Model_Adapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ArrayList<SlideModel> imageList=new ArrayList<>();
    private ArrayList<Image_Model>   imageButtons=new ArrayList<>();

    ImageSlider imageSlider;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawyer;
    androidx.appcompat.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    ImageSlider imageSlider1;
    private ImageView cartHome;

    private ImageView homeAccount, homeSearch, homeNotification, homeCart, homeWish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initviews();


        //toggle
        toggle=new ActionBarDrawerToggle(this,drawyer,toolbar,R.string.Open,R.string.Close);
        toggle.syncState();
        imageSlider();


        //image slider
        imageSlider.setImageList(imageList);
        imageSlider1.setImageList(imageList);


        //on click navigation item
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.menu_home: {
                        Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }
                    case R.id.menu_offer: {
                        Intent intent = new Intent(HomeActivity.this, Offer.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }
                    case R.id.menu_support: {
                        Intent intent = new Intent(HomeActivity.this, Support.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }
                    case R.id.menu_favourite:{
                        Intent intent=new Intent(HomeActivity.this,Parenting.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }
                    case R.id.fashion:{
                        Intent intent=new Intent(HomeActivity.this,Fashion.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }

                    case R.id.contactUs:{
                        Intent intent=new Intent(HomeActivity.this,ContactUs.class);
                        startActivity(intent);
                        drawyer.closeDrawer(GravityCompat.START);
                        break;
                    }

                }
                return true;
            }
        });
        buildimageList();
        setRecyclerView();
    }
    private void imageSlider()
    {
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babyhug_toiletries, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.hp_202178163531, ScaleTypes.FIT));
    }
    private void buildimageList() {
        for (int i=0;i<20;i++)
        {
            if(i%10==0)
            {
                Image_Model model=new Image_Model(R.drawable.cat1,"Set & Suit");
                imageButtons.add(model);
            }
            else if(i%10==1)
            {
                Image_Model model=new Image_Model(R.drawable.cat2,"T-shirt");
                imageButtons.add(model);
            }
            else if(i%10==2)
            {
                Image_Model model=new Image_Model(R.drawable.cat3,"Nightware");
                imageButtons.add(model);
            }
            else if(i%10==3)
            {
                Image_Model model=new Image_Model(R.drawable.cat4,"Shots");
                imageButtons.add(model);
            }
            else if(i%10==4)
            {
                Image_Model model=new Image_Model(R.drawable.cat5,"Inner Wear");
                imageButtons.add(model);
            }
            else if(i%10==5)
            {
                Image_Model model=new Image_Model(R.drawable.cat6,"Party Wear");
                imageButtons.add(model);
            }
            else if(i%10==6)
            {
                Image_Model model=new Image_Model(R.drawable.cat7,"Ethnic Wear");
                imageButtons.add(model);
            }
            else if(i%10==7)
            {
                Image_Model model=new Image_Model(R.drawable.cat8,"Jeans");
                imageButtons.add(model);
            }
            else if(i%10==8)
            {
                Image_Model model=new Image_Model(R.drawable.cat9,"Swim wear");
                imageButtons.add(model);
            }
            else if(i%10==9)
            {
                Image_Model model=new Image_Model(R.drawable.cat10,"Rainwear");
                imageButtons.add(model);
            }
        }
    }

    private void setRecyclerView() {
        Model_Adapter adapter=new Model_Adapter(imageButtons);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initviews() {
        recyclerView=findViewById(R.id.recycler1);
        imageSlider1=findViewById(R.id.image_slider1);
        imageSlider=findViewById(R.id.image_slider);
        nav=findViewById(R.id.navmenu);
        toolbar=findViewById(R.id.toolbar);
        drawyer=findViewById(R.id.drawyer);
        cartHome=findViewById(R.id.HomeCart);
        homeNotification=findViewById(R.id.HomeNotification);
        homeSearch=findViewById(R.id.homeSearch);
        homeWish=findViewById(R.id.homeWish);

        cartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, Cart.class);
                startActivity(intent);
            }
        });

        homeNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, Notification.class);
                startActivity(intent);
            }
        });

        homeWish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, Wishlist.class);
                startActivity(intent);
            }
        });
    }
}