package com.example.recyclerviewtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView numbersList;
    private NumbersAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersList = findViewById(R.id.rv_numbers);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(linearLayoutManager);
        numbersList.setHasFixedSize(true);

        numbersAdapter = new NumbersAdapter(100, this);
        numbersList.setAdapter(numbersAdapter);

    }
}