package com.example.a2activityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button AddButton , SubButton;
    private EditText num1 , num2;

    private int Answer;
    private int SAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButton=findViewById(R.id.add);
        SubButton=findViewById(R.id.sub);
        num1 =findViewById(R.id.FirstNum);
        num2=findViewById(R.id.SecNum);

AddButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int FirstNum = Integer.parseInt(num1.getText().toString());
        int SecNum = Integer.parseInt(num2.getText().toString());


      Intent intent = new Intent(MainActivity.this ,FinalActivity.class);
        Answer = FirstNum+SecNum;
        intent.putExtra("AddAnswer",Answer);
        startActivity(intent);
    }
  });




SubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int FirstNum = Integer.parseInt(num1.getText().toString());
                int SecNum = Integer.parseInt(num2.getText().toString());


                Intent intent = new Intent(MainActivity.this ,FinalActivity.class);
                SAnswer = FirstNum-SecNum;
                intent.putExtra("SubAnswer",SAnswer);
                startActivity(intent);
            }
        });






    }
}