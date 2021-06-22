package com.example.math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String action = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        action = intent.getStringExtra("action");

        TextView textViewSecond = findViewById(R.id.textViewSecond);

        if (action.equals("sum100")){
            textViewSecond.setText("Ты выбрал примеры на сложение до 100");
        }
        if (action.equals("sum1000")){
            textViewSecond.setText("Ты выбрал примеры на сложение до 1 000");
        }
        if (action.equals("sum10000")){
            textViewSecond.setText("Ты выбрал примеры на сложение до 10 000");
        }


        if (action.equals("minus100")){
            textViewSecond.setText("Ты выбрал примеры на вычитание до 100");
        }
        if (action.equals("minus1000")){
            textViewSecond.setText("Ты выбрал примеры на вычитание до 1 000");
        }
        if (action.equals("minus10000")){
            textViewSecond.setText("Ты выбрал примеры на вычитание до 10 000");
        }


        if (action.equals("multi10")){
            textViewSecond.setText("Ты выбрал примеры на умножение до 10");
        }
        if (action.equals("multi100")){
            textViewSecond.setText("Ты выбрал примеры на умножение до 100");
        }
        if (action.equals("multi1000")){
            textViewSecond.setText("Ты выбрал примеры на сложение до 1 000");
        }


        if (action.equals("divis10")){
            textViewSecond.setText("Ты выбрал примеры на деление до 10");
        }
        if (action.equals("divis100")){
            textViewSecond.setText("Ты выбрал примеры на деление до 100");
        }
        if (action.equals("divis1000")){
            textViewSecond.setText("Ты выбрал примеры на деление до 1 000");
        }

    }

    public void onClickButton10(View view) {
        Intent intentSecond = new Intent(SecondActivity.this, ThirdActivity.class);
        intentSecond.putExtra("count", "10");
        intentSecond.putExtra("action", action);
        startActivity(intentSecond);
    }

    public void onClickButton20(View view) {
        Intent intentSecond = new Intent(SecondActivity.this, ThirdActivity.class);
        intentSecond.putExtra("count", "20");
        intentSecond.putExtra("action", action);
        startActivity(intentSecond);
    }

    public void onClickButton30(View view) {
        Intent intentSecond = new Intent(SecondActivity.this, ThirdActivity.class);
        intentSecond.putExtra("count", "30");
        intentSecond.putExtra("action", action);
        startActivity(intentSecond);
    }
}