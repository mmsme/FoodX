package com.example.mohamedmustafa.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {
    Animation fadeIn;
    ImageView introImg;
    TextView introText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_activity);

        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        introImg = (ImageView) findViewById(R.id.intro_logo);
        introText = (TextView) findViewById(R.id.intro_text);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, SubmitActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        }, 2500);
    }
}
