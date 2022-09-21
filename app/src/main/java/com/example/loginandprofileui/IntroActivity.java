package com.example.loginandprofileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {
    //https://www.youtube.com/watch?v=tm7lnXLeCbU&t=22s

    private Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        getStartedBtn = findViewById(R.id.getStartedBtn);
        getStartedBtn.setOnClickListener( e->{
            startActivity(new Intent(IntroActivity.this, LoginActivity.class));
        });
    }
}