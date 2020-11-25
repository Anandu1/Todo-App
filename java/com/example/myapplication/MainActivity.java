package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.button2);
        register=findViewById(R.id.button);
        register.setOnClickListener(v -> {
            Intent li=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(li);
        });
        login.setOnClickListener(v -> {
        Intent ri =new Intent(MainActivity.this,LoginActivity.class);
        startActivity(ri);
        });
    }
}