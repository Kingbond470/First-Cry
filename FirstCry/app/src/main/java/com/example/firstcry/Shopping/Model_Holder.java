package com.example.firstcry.Shopping;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstcry.R;

public class Model_Holder extends RecyclerView.ViewHolder{
    private ImageButton mImgBtn;
    private TextView mTvCat;
    public Model_Holder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);

    }

    private void initviews(View itemView) {
        mImgBtn=itemView.findViewById(R.id.imgImage);
        mTvCat=itemView.findViewById(R.id.tvCat);
    }

    public void setData(Image_Model model) {
        mImgBtn.setImageResource(model.getImageId());
        mTvCat.setText(model.getCategory().toString());
    }
}
