package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Support extends AppCompatActivity {

    private EditText etMail, etPhone, etIssueType,etIssueDetails, etQuery;
    private Button btnSumbit;
    private ImageView backContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        initViews();
        backContact=findViewById(R.id.backContact);
        backContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Support.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Support.this,"Query Added Successfully",Toast.LENGTH_SHORT).show();
                etMail.setText("");
                etPhone.setText("");
                etIssueDetails.setText("");
                etIssueType.setText("");
                etQuery.setText("");
            }
        });
    }

    private void initViews() {
        etMail=findViewById(R.id.contactMail);
        etPhone=findViewById(R.id.contactPhone);
        etIssueDetails=findViewById(R.id.contactIssueDetails);
        etIssueType=findViewById(R.id.contactIssueType);
        etQuery=findViewById(R.id.contactQuery);
        btnSumbit=findViewById(R.id.contactSumbit);
    }
}