package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Tasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks2);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Task1", android.R.drawable.ic_delete),
                new MyListData("Task2", android.R.drawable.ic_delete),
                new MyListData("Task3", android.R.drawable.ic_delete),
                new MyListData("Task4", android.R.drawable.ic_delete),
                new MyListData("Task5", android.R.drawable.ic_delete),
                new MyListData("Task6", android.R.drawable.ic_delete),
                new MyListData("Task7", android.R.drawable.ic_delete),
                new MyListData("Task8", android.R.drawable.ic_delete),
                new MyListData("Task9", android.R.drawable.ic_delete),
                new MyListData("Task10", android.R.drawable.ic_delete),
                new MyListData("Task11", android.R.drawable.ic_delete),
                new MyListData("Task12", android.R.drawable.ic_delete),
        };

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}