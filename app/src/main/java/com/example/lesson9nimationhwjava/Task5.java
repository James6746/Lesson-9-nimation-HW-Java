package com.example.lesson9nimationhwjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;

public class Task5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);

        initViews();
    }

    private void initViews() {

        LottieAnimationView lottie = findViewById(R.id.img);

        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottie.playAnimation();
                lottie.setRepeatCount(5);
            }
        });
    }
}