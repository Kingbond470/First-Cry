package com.example.firstcry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    private ImageView ivMenuBar, ivWishlist;
    private LinearLayout ivNotification, ivCart;

    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mBtnContinue;
    private Button mBtnFacebook;
    private Button mBtnGoogle;
    private Button btnShowHide;
    private TextView mTvRegister;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private static final String validNumber = "^[6789][0-9]{9}$";
    private ProgressDialog progressDialog;

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        mTvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

        // login page
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformLogin();
            }
        });

        ivWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, Cart.class);
                startActivity(intent);
            }
        });

        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, Notification.class);
                startActivity(intent);
            }
        });

        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, Cart.class);
                startActivity(intent);
            }
        });

        btnShowHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEtPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                    mEtPassword.setTransformationMethod((HideReturnsTransformationMethod.getInstance()));
                    btnShowHide.setText("Hide");
                } else {
                    mEtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    btnShowHide.setText("Show");
                }
            }
        });

    }

    private void initViews() {
        ivMenuBar=findViewById(R.id.menu_bar);
        ivNotification=findViewById(R.id.notification_counter);
        ivWishlist=findViewById(R.id.iv_wishlist_icon);
        ivCart=findViewById(R.id.cart_counter);

        mEtEmail=findViewById(R.id.etNameorEmail);
        mEtPassword=findViewById(R.id.etPassword);
        mBtnContinue=findViewById(R.id.btnContinue);
        mBtnFacebook=findViewById(R.id.btnFacebook);
        mBtnGoogle=findViewById((R.id.btnGoogle));
        mTvRegister=findViewById(R.id.tvRegister);
        progressDialog =new ProgressDialog(Login.this);

        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();

        btnShowHide = findViewById(R.id.showHideBtn);
    }

    private void PerformLogin(){
        String email=mEtEmail.getText().toString();
        String pass=mEtPassword.getText().toString();
        if(!email.matches(emailValidation))
            mEtEmail.setError("Enter correct email");
        else if(!pass.matches(emailValidation)&&pass.length()<8)
            mEtPassword.setError("Enter Proper Password Format");
        else {
            progressDialog.setMessage("Please wait...");
            progressDialog.setTitle("Login");
            progressDialog.show();
            mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        Toast.makeText(Login.this,"Login Successful",
                                Toast.LENGTH_SHORT).show();
                        login();
                    }
                    else
                    {
                        progressDialog.dismiss();
                        Toast.makeText(Login.this,""+ task.getException(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    private void login() {
        Intent intent=new Intent(Login.this,HomeActivity.class);  // the class where it will go after login
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}