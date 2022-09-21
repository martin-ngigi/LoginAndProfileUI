package com.example.loginandprofileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView haveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        haveAccount = findViewById(R.id.haveAccount);
        haveAccount.setOnClickListener( e->{
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        });
    }
}