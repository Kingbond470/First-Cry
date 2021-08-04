package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ContactUs extends AppCompatActivity {

    private ImageView firstCryParenting;
    private LinearLayout ivNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        firstCryParenting=findViewById(R.id.firstCryParenting);
        ivNotification=findViewById(R.id.notification_counter);
        firstCryParenting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ContactUs.this,Parenting.class);
                startActivity(intent);
            }
        });
        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactUs.this,Notification.class);
                startActivity(intent);
            }
        });
    }
}