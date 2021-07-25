package com.example.firstcry.ItemShowRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstcry.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private ArrayList<ItemModel> itemList;
    private ItemOnClickListener itemOnClickListener;

    public ItemAdapter(ArrayList<ItemModel> itemList, ItemOnClickListener itemOnClickListener) {
        this.itemList = itemList;
        this.itemOnClickListener = itemOnClickListener;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_show_layout,parent,false);
        return  new ItemHolder(view,itemOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull  ItemHolder holder, int position) {
        ItemModel itemModel= itemList.get(position);
        holder.setData(itemModel);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
