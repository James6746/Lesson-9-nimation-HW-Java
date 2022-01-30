package com.example.lesson9nimationhwjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        initViews();
    }

    private void initViews() {

        ImageView imageView = findViewById(R.id.img);

        Animation sequentialAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_anim);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(sequentialAnim);
            }
        });
    }
}