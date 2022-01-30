package com.example.lesson9nimationhwjava;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Task1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        initViews();
    }

    private void initViews() {

        ImageView imageView = findViewById(R.id.img);

        Animation bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(bounce);
            }
        });
    }


}
