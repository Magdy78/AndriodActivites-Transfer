package com.example.a2activityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.math.MathContext;

public class FinalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        setTitle("Activity 2");
TextView Answer = findViewById(R.id.Answer);
        Intent intent = getIntent();
final int AddAnswer = intent.getIntExtra("AddAnswer",0);
final int SubAnswer = intent.getIntExtra("SubAnswer",0);

Answer.setText("Answer is = "+AddAnswer);
// Answer.setText("Answer is = "+SubAnswer);

    }
}