package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Support extends AppCompatActivity {

    private EditText etMail, etPhone, etIssueType,etIssueDetails, etQuery;
    private Button btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        initViews();
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