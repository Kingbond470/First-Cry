package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BuyDetails extends AppCompatActivity {


    private Button btnBuyContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_details);
        btnBuyContinue=findViewById(R.id.btnBuyContinue);
        btnBuyContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuyDetails.this,"Details added successfully",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BuyDetails.this,PaymentSuccessful.class);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_button_home:
                if (checked)
                    break;
            case R.id.radio_button_Office:
                if (checked)
                    break;
        }

    }
}