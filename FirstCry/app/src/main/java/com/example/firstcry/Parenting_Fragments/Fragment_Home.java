package com.example.firstcry.Parenting_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.firstcry.Parenting_Fragments.Parenting_Recycler.HomeAdapter;
import com.example.firstcry.Parenting_Fragments.Parenting_Recycler.HomeModel;
import com.example.firstcry.R;

import java.util.ArrayList;

public class Fragment_Home extends Fragment {

    private ImageView likeButton;
    private TextView likeCounter;
    private int counter = 24;
    private String val;
    RecyclerView recyclerView;
    ArrayList<HomeModel> homeModelArrayList;

    public Fragment_Home() {
        //required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__home, container, false);

        likeButton = view.findViewById(R.id.iv_like_button);
        likeCounter = view.findViewById(R.id.tv_like_counter);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        homeModelArrayList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            HomeModel ob1 = new HomeModel(R.drawable.recycler_image_1, "Headache after C-Section");
            homeModelArrayList.add(ob1);
            HomeModel ob2 = new HomeModel(R.drawable.parenting1, "Art to Creativity");
            homeModelArrayList.add(ob2);
            HomeModel ob3 = new HomeModel(R.drawable.parentign2, "Read about Pregnancy");
            homeModelArrayList.add(ob3);
        }


        recyclerView.setAdapter(new HomeAdapter(homeModelArrayList));

//        likeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter++;
//                val = Integer.toString(counter);
//                likeCounter.setText(val);
//            }
//        });

//https://medium.com/swlh/create-recyclerview-in-android-fragment-c0f0b151125f
//        recyclerView = view.findViewById(R.id.recycler_view);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        recyclerView.setAdapter(new Parenting_Adapter(imageList));

        return view;
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        initView();
//        setRecyclerviewAdapter();
//        buildRecyclerviewData();
//
//        likeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter++;
//                val = Integer.toString(counter);
//                likeCounter.setText(val);
//            }
//        });
//
//    }


}