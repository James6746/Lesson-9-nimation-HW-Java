package com.example.lesson9nimationhwjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        initViews();
    }


    private void initViews() {

        ImageView imageView = findViewById(R.id.img);

        Animation together = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(together);
            }
        });
    }
}