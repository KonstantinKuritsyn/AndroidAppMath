package com.example.math;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;


public class ThirdActivity extends AppCompatActivity {

    public static Integer firstNumber;
    public static Integer secondNumber;
    public static Integer thirdNumber;
    public static Integer countInButton;
    public static String actionInButton;
    public static String exampleString;
    public static String forDoc;
    public static Boolean end = false;
    public static Integer currentCount = 1;
    public static String answer = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intentSecond = getIntent();
        String action = intentSecond.getStringExtra("action");
        String count = intentSecond.getStringExtra("count");
        countInButton = Integer.valueOf(count);
        actionInButton = action;

        TextView textView3 = findViewById(R.id.textView3);

        textView3.setText("Пример номер " + count);

        TextView example = findViewById(R.id.example);



        if (action.equals("sum100")){
            firstNumber = rnd(11,99);
            secondNumber = rnd(11,99);
            thirdNumber = firstNumber + secondNumber;
            exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("sum1000")){
            firstNumber = rnd(101,999);
            secondNumber = rnd(101,999);
            thirdNumber = firstNumber + secondNumber;
            exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("sum10000")){
            firstNumber = rnd(1001,9999);
            secondNumber = rnd(1001,9999);
            thirdNumber = firstNumber + secondNumber;
            exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }



        if (action.equals("minus100")){
            firstNumber = 10;
            secondNumber = 100;
            while (firstNumber<=secondNumber){
                firstNumber = rnd(11,99);
                secondNumber = rnd(11,99);
            }
            thirdNumber = firstNumber - secondNumber;
            exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("minus1000")){
            firstNumber = 10;
            secondNumber = 100;
            while (firstNumber<=secondNumber){
                firstNumber = rnd(101,999);
                secondNumber = rnd(101,999);
            }
            thirdNumber = firstNumber - secondNumber;
            exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("minus10000")){
            firstNumber = 10;
            secondNumber = 100;
            while (firstNumber<=secondNumber){
                firstNumber = rnd(1001,9999);
                secondNumber = rnd(1001,9999);
            }
            thirdNumber = firstNumber - secondNumber;
            exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }



        if (action.equals("multi10")){
            firstNumber = rnd(2,9);
            secondNumber = rnd(2,9);
            thirdNumber = firstNumber * secondNumber;
            exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("multi100")){
            firstNumber = rnd(11,99);
            secondNumber = rnd(11,99);
            thirdNumber = firstNumber * secondNumber;
            exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("multi1000")){
            firstNumber = rnd(101,999);
            secondNumber = rnd(101,999);
            thirdNumber = firstNumber * secondNumber;
            exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }


        if (action.equals("divis10")){
            firstNumber = 13;
            secondNumber = 5 ;
            while (firstNumber% secondNumber!=0) {
                firstNumber = rnd(11, 99);
                secondNumber = rnd(2, 10);
            }
            thirdNumber = firstNumber / secondNumber;
            exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("divis100")){
            firstNumber = 13;
            secondNumber = 5 ;
            while (firstNumber% secondNumber!=0) {
                firstNumber = rnd(101, 999);
                secondNumber = rnd(2, 99);
            }
            thirdNumber = firstNumber / secondNumber;
            exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }
        if (action.equals("divis1000")){
            firstNumber = 13;
            secondNumber = 5 ;
            while (firstNumber% secondNumber!=0) {
                firstNumber = rnd(1001, 9999);
                secondNumber = rnd(2, 999);
            }
            thirdNumber = firstNumber / secondNumber;
            exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
            example.setText(exampleString);
        }

        Date date = new Date();


        forDoc = "Выбрано " + countInButton.toString() + " примеров на " + actionInButton + ". Время начала: " + date.toString().substring(0,20) + "\n \n";

    }

    public void onClickButtonOK(View view) {
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        TextView example = findViewById(R.id.example);
        if(editTextNumber.getText().toString().equals("")){

        }
        else {
            String answer = editTextNumber.getText().toString();
            Integer answerInt = Integer.parseInt(answer);
            if (thirdNumber.equals(answerInt)) {
                forDoc = forDoc + "\n Пример " + countInButton.toString() + " решён верно\n \n";
            } else {
                forDoc = forDoc + "\n Пример " + countInButton.toString() + " решён не верно\n " + exampleString + " ТВОЙ ОТВЕТ: " + answer + "\n" + "ПРАВИЛЬНЫЙ ОТВЕТ: " + thirdNumber + "\n \n";
            }
            example.setText("отвечено");
            editTextNumber.setText("");
        }
    }



    public void onClickButtonNEXT(View view) {

        TextView example = findViewById(R.id.example);

        if (currentCount < countInButton) {

            if (actionInButton.equals("sum100")) {
                firstNumber = rnd(11, 99);
                secondNumber = rnd(11, 99);
                thirdNumber = firstNumber + secondNumber;
                exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("sum1000")) {
                firstNumber = rnd(101, 999);
                secondNumber = rnd(101, 999);
                thirdNumber = firstNumber + secondNumber;
                exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("sum10000")) {
                firstNumber = rnd(1001, 9999);
                secondNumber = rnd(1001, 9999);
                thirdNumber = firstNumber + secondNumber;
                exampleString = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }


            if (actionInButton.equals("minus100")) {
                firstNumber = 10;
                secondNumber = 100;
                while (firstNumber <= secondNumber) {
                    firstNumber = rnd(11, 99);
                    secondNumber = rnd(11, 99);
                }
                thirdNumber = firstNumber - secondNumber;
                exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("minus1000")) {
                firstNumber = 10;
                secondNumber = 100;
                while (firstNumber <= secondNumber) {
                    firstNumber = rnd(101, 999);
                    secondNumber = rnd(101, 999);
                }
                thirdNumber = firstNumber - secondNumber;
                exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("minus10000")) {
                firstNumber = 10;
                secondNumber = 100;
                while (firstNumber <= secondNumber) {
                    firstNumber = rnd(1001, 9999);
                    secondNumber = rnd(1001, 9999);
                }
                thirdNumber = firstNumber - secondNumber;
                exampleString = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }


            if (actionInButton.equals("multi10")) {
                firstNumber = rnd(2, 9);
                secondNumber = rnd(2, 9);
                thirdNumber = firstNumber * secondNumber;
                exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("multi100")) {
                firstNumber = rnd(11, 99);
                secondNumber = rnd(11, 99);
                thirdNumber = firstNumber * secondNumber;
                exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("multi1000")) {
                firstNumber = rnd(101, 999);
                secondNumber = rnd(101, 999);
                thirdNumber = firstNumber * secondNumber;
                exampleString = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }


            if (actionInButton.equals("divis10")) {
                firstNumber = 13;
                secondNumber = 5;
                while (firstNumber % secondNumber != 0) {
                    firstNumber = rnd(11, 99);
                    secondNumber = rnd(2, 10);
                }
                thirdNumber = firstNumber / secondNumber;
                exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("divis100")) {
                firstNumber = 13;
                secondNumber = 5;
                while (firstNumber % secondNumber != 0) {
                    firstNumber = rnd(101, 999);
                    secondNumber = rnd(2, 99);
                }
                thirdNumber = firstNumber / secondNumber;
                exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }
            if (actionInButton.equals("divis1000")) {
                firstNumber = 13;
                secondNumber = 5;
                while (firstNumber % secondNumber != 0) {
                    firstNumber = rnd(1001, 9999);
                    secondNumber = rnd(2, 999);
                }
                thirdNumber = firstNumber / secondNumber;
                exampleString = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber);
                example.setText(exampleString);
            }

            countInButton--;

            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Пример номер " + countInButton);


        }
        else {
            Date date1 = new Date();
            forDoc = forDoc + "\n" + "Время окончания: " + date1.toString().substring(0,20);

            example.setText("ВСЁ");
            Intent intentThird = new Intent(ThirdActivity.this, FoursActivity.class);
            intentThird.putExtra("textLog", forDoc);
            startActivity(intentThird);
        }



    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}