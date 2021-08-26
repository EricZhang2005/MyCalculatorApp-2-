package com.example.mycalculatorapp;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnToggleDark;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // code provided by https://www.geeksforgeeks.org/how-to-implement-dark-night-mode-in-android-app/
        btnToggleDark = findViewById(R.id.btnToggleDark);

        btnToggleDark.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    }
                }
                );
        // Saving state of our app
        // using SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final boolean isDarkModeOn = sharedPreferences.getBoolean("isDarkModeOn", false);

        // When user reopens the app
        // after applying dark/light mode
        if (isDarkModeOn) {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_YES);
            btnToggleDark.setText(
                    "Disable Dark Mode");
        }
        else {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_NO);
            btnToggleDark
                    .setText(
                            "Enable Dark Mode");
        }

        btnToggleDark.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view)
                    {
                        // When user taps the enable/disable
                        // dark mode button
                        if (isDarkModeOn) {

                            // if dark mode is on it
                            // will turn it off
                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_NO);
                            // it will set isDarkModeOn
                            // boolean to false
                            editor.putBoolean(
                                    "isDarkModeOn", false);
                            editor.apply();

                            // change text of Button
                            btnToggleDark.setText(
                                    "Enable Dark Mode");
                        }
                        else {

                            // if dark mode is off
                            // it will turn it on
                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_YES);

                            // it will set isDarkModeOn
                            // boolean to true
                            editor.putBoolean(
                                    "isDarkModeOn", true);
                            editor.apply();

                            // change text of Button
                            btnToggleDark.setText(
                                    "Disable Dark Mode");
                        }
                    }
                });
        // end of code provided by https://www.geeksforgeeks.org/how-to-implement-dark-night-mode-in-android-app/
    }


    public void add(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double sum = num1 + num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + sum);
    }




    public void subt(View v){
        // Get reference to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // subtract the two ints
        double diff = num1 - num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + diff);
    }


    public void mult(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double product = num1 * num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + product);
    }

    public void divide(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double quotient = num1 / num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + quotient);
    }
    /*
    public void exp(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double exp = num1 + num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + exp);

    } */

    public void exponential(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double result = Math.pow(num1, num2);

        // set the text for the answer
        ansTextView.setText("Answer: " + result);
    }


}