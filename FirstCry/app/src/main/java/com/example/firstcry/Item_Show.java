package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.firstcry.ItemShowRecyclerView.ItemAdapter;
import com.example.firstcry.ItemShowRecyclerView.ItemModel;
import com.example.firstcry.ItemShowRecyclerView.ItemOnClickListener;

import java.util.ArrayList;

public class Item_Show extends AppCompatActivity implements ItemOnClickListener {

    private RecyclerView recyclerView;
    private ArrayList<ItemModel> itemList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_show);
        initViews();
        setRecyclerView();
        itemBuildList();
    }

    private void itemBuildList() {
        for(int i=0; i<=6; i++){
            ItemModel itemModel=new ItemModel(R.drawable.e9,"Cute Walk by Babyhug","465 "," 385 ","23% OFF","Monday, Aug 2");
            itemList.add(itemModel);
            ItemModel itemModel1=new ItemModel(R.drawable.e1,"Krishna Cloths","700 "," 225 ","40% OFF","Monday, Aug 9");
            itemList.add(itemModel1);
            ItemModel itemModel2=new ItemModel(R.drawable.e2,"Baby Coats by Hero","500 "," 105 ","19% OFF","Monday, Aug 16");
            itemList.add(itemModel2);
            ItemModel itemModel3=new ItemModel(R.drawable.e3,"Pine Kids","465 "," 400","10% OFF","Tuesday, Aug 3");
            itemList.add(itemModel3);
            ItemModel itemModel4=new ItemModel(R.drawable.e4,"Disney by Crossroads","800 "," 385 ","55% OFF","Tuesday, Aug 10");
            itemList.add(itemModel4);
            ItemModel itemModel5=new ItemModel(R.drawable.e5,"Luke and Lily","300 "," 365 ","11% OFF","Tuesday, Aug 17");
            itemList.add(itemModel5);
            ItemModel itemModel6=new ItemModel(R.drawable.e6,"The Sandbox Clothing Co","700 "," 205 ","38% OFF","Monday, Aug 2");
            itemList.add(itemModel6);
            ItemModel itemModel7=new ItemModel(R.drawable.e7,"Knitroot","1000 "," 235 ","67% OFF","Thursday, Aug 5");
            itemList.add(itemModel7);
        }
    }

    private void setRecyclerView() {
        ItemAdapter itemAdapter=new ItemAdapter(itemList,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }


    private void initViews() {
        recyclerView=findViewById(R.id.ItemRecyclerVIew);
    }

    @Override
    public void onClickItem(ItemModel itemModel, int position) {
        Toast.makeText(Item_Show.this,itemModel.getName()+"  "+ position, Toast.LENGTH_SHORT).show();
        PrefernceHelper.writeIntToPreference(this,"imageId",itemModel.getImgaeId());
        PrefernceHelper.writeStringToPreference(this,"name",itemModel.getName());
        PrefernceHelper.writeStringToPreference(this,"ogPrice",itemModel.getOgPrice());
        PrefernceHelper.writeStringToPreference(this,"cutPrice",itemModel.getCutPrice());
        PrefernceHelper.writeStringToPreference(this,"offPercent",itemModel.getOffPercent());
        PrefernceHelper.writeStringToPreference(this,"date",itemModel.getDate());
        Intent intent=new Intent(Item_Show.this,ItemDetails.class);
        startActivity(intent);
    }
}