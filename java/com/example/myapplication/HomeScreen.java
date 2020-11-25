package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class HomeScreen extends AppCompatActivity {
TextView a,b,c,d,e,f,ta,tb;
ImageView ai,bi,ci,di,ei,fi;
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        a=findViewById(R.id.ta);
        b=findViewById(R.id.tb);
        c=findViewById(R.id.tc);
        d=findViewById(R.id.td);
        e=findViewById(R.id.te);
        f=findViewById(R.id.tf);
        ai=findViewById(R.id.workim);
        bi=findViewById(R.id.schoolm);
        ci=findViewById(R.id.appoim);
        di=findViewById(R.id.exerim);
        ei=findViewById(R.id.caleim);
        fi=findViewById(R.id.noteim);
        ta=findViewById(R.id.textView1);
        tb=findViewById(R.id.textView11);
        cardView=findViewById(R.id.cv);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent task=new Intent(HomeScreen.this,Tasks.class);
                startActivity(task);
            }
        });
    }
}