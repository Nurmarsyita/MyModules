package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDetails = findViewById(R.id.textViewDetails);
        btnBack = findViewById(R.id.buttonBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intentReceived = getIntent();
        String modCode = intentReceived.getStringExtra("ModuleCode");

        if (modCode.equals("C346")) {
            tvDetails.setText("Module Code: C346\nModule Name: Android Programming\n" + "Academic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        } else if (modCode.equals("C349")) {
            tvDetails.setText("Module Code: C349\nModule Name: iPad Programming\n" + "Academic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}