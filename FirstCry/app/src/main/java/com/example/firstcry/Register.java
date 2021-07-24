package com.example.firstcry;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    private ImageView ivMenuBar, ivWishlist;
    private LinearLayout ivNotification, ivCart;

    private EditText mEtName;
    private EditText mEtMobile;
    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mBtnContinue;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private ProgressDialog progressDialog;

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformAuth();
            }
        });

        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this, Cart.class);
                startActivity(intent);
            }
        });

        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this, Notification.class);
                startActivity(intent);
            }
        });

        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this, Cart.class);
                startActivity(intent);
            }
        });
    }

    private void PerformAuth() {
        String name=mEtName.getText().toString();
        String mobile=mEtMobile.getText().toString();
        String email=mEtEmail.getText().toString();
        String pass=mEtPassword.getText().toString();
        if(!email.matches(emailValidation))
            mEtEmail.setError("Enter correct email");
        else if(!pass.matches(emailValidation)&&pass.length()<8)
            mEtPassword.setError("Enter Proper Password Format");
        else {
            progressDialog.setMessage("Please wait...");
            progressDialog.setTitle("Registration");
            progressDialog.show();
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        Toast.makeText(Register.this,"Regidter SuccesFull",Toast.LENGTH_LONG).show();
                        login();
                    }
                    else
                    {
                        progressDialog.dismiss();
                        Toast.makeText(Register.this,""+ task.getException(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    private void login() {
        Intent intent=new Intent(Register.this,Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initViews() {
        ivMenuBar=findViewById(R.id.menu_bar);
        ivNotification=findViewById(R.id.notification_counter);
        ivWishlist=findViewById(R.id.iv_wishlist_icon);
        ivCart=findViewById(R.id.cart_counter);

        mEtEmail=findViewById(R.id.etNameorEmail);
        mBtnContinue=findViewById(R.id.btnContinue1);
        mEtName=findViewById(R.id.etName);
        mEtMobile=findViewById(R.id.etMobile);
        mEtEmail=findViewById(R.id.etEmail);
        mEtPassword=findViewById(R.id.etPassword);
        progressDialog =new ProgressDialog(Register.this);
        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();
    }
}