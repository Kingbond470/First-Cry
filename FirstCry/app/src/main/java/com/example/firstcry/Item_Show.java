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
        for(int i=0; i<=30; i++){
            ItemModel itemModel=new ItemModel(R.drawable.offer2,"Cute Walk by Babyhug","465","385","23% OFF","Monday, Aug 2");
            itemList.add(itemModel);
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