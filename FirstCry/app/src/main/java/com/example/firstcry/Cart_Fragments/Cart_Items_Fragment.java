package com.example.firstcry.Cart_Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.firstcry.HomeActivity;
import com.example.firstcry.ItemShowRecyclerView.ItemAdapter;
import com.example.firstcry.ItemShowRecyclerView.ItemModel;
import com.example.firstcry.ItemShowRecyclerView.ItemOnClickListener;
import com.example.firstcry.R;

import java.util.ArrayList;


public class Cart_Items_Fragment extends Fragment implements ItemOnClickListener {

    private RecyclerView recyclerView;
    public static ArrayList<ItemModel> itemList=new ArrayList<>();
    private Button cartToShopping;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_cart__items_, container, false);
        cartToShopping=container.findViewById(R.id.cartToShopping);
        recyclerView=container.findViewById(R.id.cartRecyclerView);

        if(itemList.size()==0){
            cartToShopping.setVisibility(View.VISIBLE);
            cartToShopping.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getContext(), HomeActivity.class);
                    startActivity(intent);
                }
            });
        }
        else
            {
            setRecyclerView();

        }


        return view;
    }

    private void setRecyclerView() {
        ItemAdapter itemAdapter=new ItemAdapter(itemList,this::onClickItem);    //check error here
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    @Override
    public void onClickItem(ItemModel itemModel, int position) {


    }
}