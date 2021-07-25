package com.example.firstcry.ItemShowRecyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstcry.R;

public class ItemHolder extends RecyclerView.ViewHolder {


    private ImageView ivImage;
    private TextView name, ogPrice, cutPrice, offPercent, date;
    private LinearLayout linearLayout;
    private ItemOnClickListener itemOnClickListener;

    public ItemHolder(@NonNull View itemView, ItemOnClickListener itemOnClickListener) {
        super(itemView);
        this.itemOnClickListener=itemOnClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivImage=itemView.findViewById(R.id.itemImage);
        name=itemView.findViewById(R.id.itemName);
        ogPrice=itemView.findViewById(R.id.ItemPrice);
        cutPrice=itemView.findViewById(R.id.tvRupees);
        offPercent=itemView.findViewById(R.id.itemOff);
        date=itemView.findViewById(R.id.day);
        linearLayout=itemView.findViewById(R.id.ClickLinearlayoutItem);
    }

    public void setData(ItemModel itemModel){
        ivImage.setImageResource(itemModel.getImgaeId());
        name.setText(itemModel.getName());
        ogPrice.setText(itemModel.getOgPrice());
        cutPrice.setText(itemModel.getCutPrice());
        offPercent.setText(itemModel.getOffPercent());
        date.setText(itemModel.getDate());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClickListener.onClickItem(itemModel,getAdapterPosition());
            }
        });
    }

}
