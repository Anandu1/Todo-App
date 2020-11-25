package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
EditText email,pass;
Button login,reg;
private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        email=findViewById(R.id.emid);
        pass=findViewById(R.id.psid);
        login=findViewById(R.id.lgbtn);
        reg=findViewById(R.id.rgbtn);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regi=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(regi);
            }
        });
        auth= FirebaseAuth.getInstance();
        login.setOnClickListener(v -> {
            String txtmail=email.getText().toString();
            String txtpass=pass.getText().toString();
            loginuser(txtmail,txtpass);
        });

    }
    private void loginuser(String email,String pass){
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                Intent dashboad=new Intent(LoginActivity.this,HomeScreen.class);
                startActivity(dashboad);
                finish();
            }
            else {
                Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        });
}
}