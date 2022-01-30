package com.example.lesson9nimationhwjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class Task4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);

        initViews();
    }


    private void initViews() {

        LottieAnimationView lottie = findViewById(R.id.img);

        Animation together = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);

        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottie.playAnimation();
                lottie.setRepeatCount(5);
            }
        });
    }
}