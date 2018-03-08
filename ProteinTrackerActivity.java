package com.example.andrew.bodybulkerv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProteinTrackerActivity extends AppCompatActivity {

    int proteinTotal = 0;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_tracker);

        total = findViewById(R.id.totalTextView);

        //Calls data from shared preferences
        SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
        int dailyIntake = dailyProteinIntake.getInt("dailyIntake", 0);
        total.setText(String.valueOf(dailyIntake));

        //Adds Egg protein amount to total text when button is clicked
        Button largeEggButton = (Button) findViewById(R.id.largeEggButton);
        largeEggButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 6;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Clears total text when button is clicked
        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = 0;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Adds swiss cheese protein amount to total text when button is clicked
        Button swissCheeseButton = (Button) findViewById(R.id.swissCheeseButton);
        swissCheeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 8;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Adds greek yogurt protein amount to total text when button is clicked
        Button greekYogurtButton = (Button) findViewById(R.id.greekYogurtButton);
        greekYogurtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 23;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Adds whey protein amount to total text when button is clicked
        Button wheyButton = (Button) findViewById(R.id.wheyButton);
        wheyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 24;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Adds cottage cheese protein amount to total text when button is clicked
        Button cottageCheeseButton = (Button) findViewById(R.id.cottageCheeseButton);
        cottageCheeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 14;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Adds chicken breast protein amount to total text when button is clicked
        Button chickenBreastButton = (Button) findViewById(R.id.chickenBreastButton);
        chickenBreastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinTotal = proteinTotal + 24;
                total.setText(String.valueOf(proteinTotal));

                SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = dailyProteinIntake.edit();
                editor.putInt("dailyIntake", proteinTotal);;
                editor.apply();
            }
        });

        //Takes user back to home activity when butting is clicked
        Button homeButton = (Button) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = getIntent();
                main = new Intent(ProteinTrackerActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

    }
}
