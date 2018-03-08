package com.example.andrew.bodybulkerv2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andrew.bodybulkerv2.MainActivity;
import com.example.andrew.bodybulkerv2.R;

public class BodyFatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_fat);


        //Starts calculation of lean body mass when button is clicked.
        Button calculateBtn = (Button) findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText weightEditText = (EditText) findViewById(R.id.weightEditText);
                EditText bodyFatEditText = (EditText) findViewById(R.id.bodyFatEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                //Set variables.
                int leanMass = 0;
                int bodyFatPercent = 0;
                int weight = 0;
                int protein = 1;
                int dailyProtein = 0;
                int grossLeanMass = 0;

                //Try catch used here to that app doesn't crash if no data is entered but button is then clicked.
                try {
                    String weightText = weightEditText.getText().toString();
                    weight = Integer.parseInt(weightText);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                //Try catch used here to that app doesn't crash if no data is entered but button is then clicked.
                try {
                    String fatText = bodyFatEditText.getText().toString();
                    bodyFatPercent = Integer.parseInt(fatText);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                //Calculation for Lean Mass
                grossLeanMass = weight * bodyFatPercent / 100;
                leanMass = weight - grossLeanMass;

                //Calculates daily protein
                dailyProtein = leanMass * protein;

                //Passes variable data to MainActivity Screen
                Intent passMass = new Intent(BodyFatActivity.this, MainActivity.class);
                startActivity(passMass);

                //Saves variable data to shared preferences so that they can be called from other activities.
                SharedPreferences massData = getSharedPreferences("leanMassInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = massData.edit();
                editor.putInt("Mass", leanMass);
                editor.putInt("ProteinPerDay", dailyProtein);
                editor.putInt("Weight", weight);
                editor.putInt("Fat", bodyFatPercent);
                editor.apply();
            }
        });


    }
}
