package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.firstcry.Shopping.Image_Model;
import com.example.firstcry.Shopping.Model_Adapter;


import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ArrayList<SlideModel> imageList=new ArrayList<>();
    private ArrayList<Image_Model>   imageButtons=new ArrayList<>();
    private ImageSlider imageSlider;
    private ImageSlider imageSlider1;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initviews();
        buildStudentList();
        setRecyclerView();
        imageList.add(new SlideModel(R.drawable.babycare, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babyhuy, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.babyoye, ScaleTypes.FIT));
        imageSlider.setImageList(imageList);
        imageSlider1.setImageList(imageList);
    }

    private void buildStudentList() {
        for (int i=0;i<20;i++)
        {
            if(i%4==0)
            {
                Image_Model model=new Image_Model(R.drawable.babycare);
                imageButtons.add(model);
            }
            else if(i%4==1)
            {
                Image_Model model=new Image_Model(R.drawable.babycare);
                imageButtons.add(model);
            }
            else if(i%4==2)
            {
                Image_Model model=new Image_Model(R.drawable.babycare);
                imageButtons.add(model);
            }
            else if(i%4==3)
            {
                Image_Model model=new Image_Model(R.drawable.babycare);
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
        imageSlider=findViewById(R.id.image_slider);
        imageSlider1=findViewById(R.id.image_slider1);
        recyclerView=findViewById(R.id.recycler1);
    }

}