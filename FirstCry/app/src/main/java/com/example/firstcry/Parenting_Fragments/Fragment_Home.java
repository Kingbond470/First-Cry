package com.example.firstcry.Parenting_Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.firstcry.R;

import java.util.ArrayList;

public class Fragment_Home extends Fragment {

    private ArrayList<SlideModel> imageList;
    private ImageSlider imageSlider;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
        imageList = new ArrayList<SlideModel>();
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));


        imageSlider.setImageList(imageList);
    }

    private void initView(View view) {
        imageSlider = view.findViewById(R.id.image_slider);

    }

}