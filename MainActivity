package com.example.andrew.bodybulkerv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView leanMassResult;
    TextView bmiResult;
    TextView dailyProtein;
    TextView weight;
    TextView fat;
    TextView proteinIntake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leanMassResult = (TextView) findViewById(R.id.leanMassResultText);
        bmiResult = (TextView) findViewById(R.id.bmiResultViewText);
        dailyProtein = (TextView) findViewById(R.id.dailyProteinTextView);
        weight = (TextView) findViewById(R.id.WeightTextView);
        fat = (TextView) findViewById(R.id.FatTextView);
        proteinIntake = (TextView) findViewById(R.id.intakeTextView

        );

        //Run Methods
        getMass();
        getProtein();
        getBMI();
        getWeight();
        getFat();
        getProteinIntake();

        //Calls Protein Activity Screen when button is clicked
        Button proteinBtn = (Button) findViewById(R.id.proteinBtn);
        proteinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent proteinBtn = getIntent();
                proteinBtn = new Intent(MainActivity.this, ProteinTrackerActivity.class);
                startActivity(proteinBtn);
            }
        });

        //Calls Body fat Activity Screen when button is clicked
        Button bodyFatBtn = (Button) findViewById(R.id.bodyFatBtn);
        bodyFatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bodyFatBtn = getIntent();
                bodyFatBtn = new Intent(MainActivity.this, BodyFatActivity.class);
                startActivity(bodyFatBtn);
            }
        });

        //Calls BMI Activity Screen when button is clicked
        Button bmiIndexBtn = (Button) findViewById(R.id.bmiIndexBtn);
        bmiIndexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bmiIndex = getIntent();
                bmiIndex = new Intent(MainActivity.this, BMIActivity.class);
                startActivity(bmiIndex);
            }
        });

        //Calls Camera Activity Screen when button is clicked
        Button cameraBtn = (Button) findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePic = getIntent();
                takePic = new Intent(MainActivity.this, TakePictureActivity.class);
                startActivity(takePic);
            }
        });
    }

    //Sets weight text when called
    public void getWeight()
    {
        //Pulls info from shared preferences
        SharedPreferences massData = getSharedPreferences("leanMassInfo", Context.MODE_PRIVATE);
        int wightInfo = massData.getInt("Weight", 0);
        weight.setText(String.valueOf(wightInfo + " " + "lbs"));
    }

    //Sets body fat text when called
    public void getFat()
    {
        //Pulls info from shared preferences
        SharedPreferences massData = getSharedPreferences("leanMassInfo", Context.MODE_PRIVATE);
        int fatInfo = massData.getInt("Fat", 0);
        fat.setText(String.valueOf(fatInfo + "%"));
    }

    //Sets lean mass text when called
    public void getMass()
    {
        //Pulls info from shared preferences
        SharedPreferences massData = getSharedPreferences("leanMassInfo", Context.MODE_PRIVATE);
        int leanMassInfo = massData.getInt("Mass", 0);
        leanMassResult.setText(String.valueOf(leanMassInfo + " " + "lbs"));
    }

    //Sets protein amount text when called
    public void getProtein()
    {
        //Pulls info from shared preferences
        SharedPreferences massData = getSharedPreferences("leanMassInfo", Context.MODE_PRIVATE);
        int dailyProteinInfo = massData.getInt("ProteinPerDay", 0);
        dailyProtein.setText(String.valueOf(dailyProteinInfo + " " + "grams"));
    }

    //Sets weight text when called
    public void getBMI()
    {
        //Pulls info from shared preferences
        SharedPreferences bmiData = getSharedPreferences("BMIInfo", Context.MODE_PRIVATE);
        int BMIResultInfo = bmiData.getInt("BMIResult", 0);
        bmiResult.setText(String.valueOf(BMIResultInfo));
    }

    //Sets daily protein intake text when called
    public void getProteinIntake()
    {
        //Pulls info from shared preferences
        SharedPreferences dailyProteinIntake = getSharedPreferences("dailyProteinIntakeInfo", Context.MODE_PRIVATE);
        int dailyIntake = dailyProteinIntake.getInt("dailyIntake", 0);
        proteinIntake.setText(String.valueOf(dailyIntake));
    }
}
