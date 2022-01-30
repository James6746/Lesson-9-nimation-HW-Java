package com.example.lesson9nimationhwjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {

        Button task1 = findViewById(R.id.task1);
        Button task2 = findViewById(R.id.task2);
        Button task3 = findViewById(R.id.task3);
        Button task4 = findViewById(R.id.task4);
        Button task5 = findViewById(R.id.task5);
        Button task6 = findViewById(R.id.task6);

        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task1.class);
                startActivity(intent);
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task2.class);
                startActivity(intent);
            }
        });

        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task3.class);
                startActivity(intent);
            }
        });

        task4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task4.class);
                startActivity(intent);
            }
        });

        task5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task5.class);
                startActivity(intent);
            }
        });

        task6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Task6.class);
                startActivity(intent);
            }
        });
    }
}