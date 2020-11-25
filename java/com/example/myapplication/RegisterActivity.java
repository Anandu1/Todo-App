package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
EditText emtxt,pwtxt;
Button btn,rbt;
private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        emtxt=findViewById(R.id.editTextTextPersonName);
        pwtxt=findViewById(R.id.editTextTextPersonName2);
        btn=findViewById(R.id.regbtn);
        rbt=findViewById(R.id.lbtn);
        auth= FirebaseAuth.getInstance();
        rbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logact=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(logact);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtmail=emtxt.getText().toString();
                String txtpass=pwtxt.getText().toString();
                if (TextUtils.isEmpty(txtmail )|| TextUtils.isEmpty(txtpass)){
                    Toast.makeText(RegisterActivity.this,"Empty credentials",Toast.LENGTH_SHORT).show();
                }
                else {
                    registerUser(txtmail,txtpass);
                }
            }
        });
    }
    public void registerUser(String emtxt,String pwtxt){
        auth.createUserWithEmailAndPassword(emtxt, pwtxt).addOnCompleteListener(RegisterActivity.this,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){
                  Toast.makeText(RegisterActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();
              }
              else {
                  Toast.makeText(RegisterActivity.this,"Registration failed",Toast.LENGTH_SHORT).show();
              }
            }
        });
}}