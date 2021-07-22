package com.example.firstcry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {


    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mBtnContinue;
    private Button mBtnFacebook;
    private Button mBtnGoogle;
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
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformLogin();
            }
        });
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
                        Toast.makeText(Login.this,"Login SuccesFull",
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
        Intent intent=new Intent(Login.this,Home_Page_Activity.class);  // the class where it will go after login
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initViews() {
        mEtEmail=findViewById(R.id.etNameorEmail);
        mEtPassword=findViewById(R.id.etPassword);
        mBtnContinue=findViewById(R.id.btnContinue);
        mBtnFacebook=findViewById(R.id.btnFacebook);
        mBtnGoogle=findViewById((R.id.btnGoogle));
        mTvRegister=findViewById(R.id.tvRegister);
        progressDialog =new ProgressDialog(Login.this);

        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();
    }
}