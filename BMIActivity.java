package com.example.andrew.bodybulkerv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        Button calculateBMIBtn = (Button) findViewById(R.id.calculateBMIBtn);
        calculateBMIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText weightKGEditText = (EditText) findViewById(R.id.weightKGEditText);
                EditText heightEditText = (EditText) findViewById(R.id.heightEditText);;

                int BMI = 0;
                try {
                    double bmiWeight = Integer.parseInt(weightKGEditText.getText().toString());
                    double bmiHeight = Integer.parseInt(heightEditText.getText().toString());

                    double weightConvert = bmiWeight * 0.45;
                    double heightConvert = bmiHeight * 0.025;
                    double squareResult = heightConvert *heightConvert;
                    double BMIGross = weightConvert / squareResult;
                    BMI = (int)Math.round(BMIGross);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


                //Passes variable data to MainActivity Screen
                Intent passBMI = new Intent(BMIActivity.this, MainActivity.class);
                startActivity(passBMI);

                SharedPreferences bmiData = getSharedPreferences("BMIInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = bmiData.edit();
                editor.putInt("BMIResult", BMI);
                editor.apply();


            }
        });

        Button bmiScaleBtn = (Button) findViewById(R.id.bmiScaleBtn);
        bmiScaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bmiScaleBtn = getIntent();
                bmiScaleBtn = new Intent(BMIActivity.this, BMIScaleActivity.class);
                startActivity(bmiScaleBtn);

            }
        });
    }
}

