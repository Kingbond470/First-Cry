package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.firstcry.Cart_Fragments.Cart_Items_Fragment;
import com.example.firstcry.ItemShowRecyclerView.ItemModel;

public class ItemDetails extends AppCompatActivity {

    private Button addToCart, buyNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        addToCart=findViewById(R.id.addToCart);
        buyNow=findViewById(R.id.buyNow);

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
    }
}