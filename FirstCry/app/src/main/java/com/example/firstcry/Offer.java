package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Offer extends AppCompatActivity {

    private ImageView ivItemImageOne, ivItemImageTwo, ivItemImageThree, ivItemImageFour, ivItemImageFive,ivItemImageSix, ivItemImageSeven, ivItemImageEight;
    private ImageView ivItemImageNine, ivItemImageTen, ivItemImageEleven, ivItemImageTweleve, ivItemImageThirteen, ivItemImageFourteen, ivItemImageSixteen, ivItemImageSeventeen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
        ivItemImageOne=findViewById(R.id.offer1);
        ivItemImageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //2
        ivItemImageTwo=findViewById(R.id.offer2);
        ivItemImageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //3
        ivItemImageThree=findViewById(R.id.offer3);
        ivItemImageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //4
        ivItemImageFour=findViewById(R.id.offer4);
        ivItemImageFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //5
        ivItemImageFive=findViewById(R.id.offer5);
        ivItemImageFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //6
        ivItemImageSix=findViewById(R.id.offer6);
        ivItemImageSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //7
        ivItemImageSeven=findViewById(R.id.offer7);
        ivItemImageSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //8
        ivItemImageEight=findViewById(R.id.offer8);
        ivItemImageEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //9
        ivItemImageNine=findViewById(R.id.offer9);
        ivItemImageNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //10
        ivItemImageTen=findViewById(R.id.offer10);
        ivItemImageTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //11
        ivItemImageEleven=findViewById(R.id.offer11);
        ivItemImageEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //12
        ivItemImageTweleve=findViewById(R.id.offer12);
        ivItemImageTweleve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //13
        ivItemImageThirteen=findViewById(R.id.offer13);
        ivItemImageThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //14
        ivItemImageFourteen=findViewById(R.id.offer14);
        ivItemImageFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //15
        ivItemImageSixteen=findViewById(R.id.offer15);
        ivItemImageSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });

        //16
        ivItemImageSeventeen=findViewById(R.id.offer16);
        ivItemImageSeventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Offer.this,Item_Show.class);
                startActivity(intent);
            }
        });
    }
}