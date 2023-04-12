package com.rnw.creditscore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


@SuppressWarnings("all")
public class HomeActivity extends AppCompatActivity {
    ImageView banklist;
    ImageView calculator;
    ImageView checkofflion;
    ImageView checkonlion;
    ImageView maintips;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);

        banklist = findViewById(R.id.banklist);
        calculator = findViewById(R.id.calculator);
        checkofflion = findViewById(R.id.checkofflion);
        checkonlion = findViewById(R.id.checkonlion);
        maintips = findViewById(R.id.maintips);


        checkofflion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        checkonlion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        maintips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, CalculatorActivity.class));
            }
        });

        banklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
