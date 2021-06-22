package com.example.math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickButtonSum100(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "sum100");
        startActivity(intent);
    }

    public void onClickButtonSum1000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "sum1000");
        startActivity(intent);
    }

    public void onClickButtonSum10000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "sum10000");
        startActivity(intent);
    }

    public void onClickButtonMinus100(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "minus100");
        startActivity(intent);
    }

    public void onClickButtonMinus1000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "minus1000");
        startActivity(intent);
    }

    public void onClickButtonMinus10000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "minus10000");
        startActivity(intent);
    }

    public void onClickButtonMulti10(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "multi10");
        startActivity(intent);
    }

    public void onClickButtonMulti100(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "multi100");
        startActivity(intent);
    }

    public void onClickButtonMulti1000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "multi1000");
        startActivity(intent);
    }

    public void onClickButtonDivis10(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "divis10");
        startActivity(intent);
    }

    public void onClickButtonDivis100(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "divis100");
        startActivity(intent);
    }

    public void onClickButtonDivis1000(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("action", "divis1000");
        startActivity(intent);
    }
}