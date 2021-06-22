package com.example.math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fours);

        Intent intentThird = getIntent();
        String fullText = intentThird.getStringExtra("textLog");

        TextView fullTextView = findViewById(R.id.fullText);

        fullTextView.setText(fullText);
    }
}