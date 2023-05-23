package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView year;
    TextView sem;
    TextView modCredit;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        modCode = findViewById(R.id.textViewModCode);
        modName = findViewById(R.id.textViewModName);
        year = findViewById(R.id.textViewYear);
        sem = findViewById(R.id.textViewSem);
        modCredit = findViewById(R.id.textViewCredit);
        venue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String mod1 = intentReceived.getStringExtra("modules");
        modCode.setText("Module Code: C346");
        modName.setText("Module Name: Android Programming");
        year.setText("Academic Year: 2020");
        sem.setText("Semester: 1");
        modCredit.setText("Module Credit: 4");
        venue.setText("Venue: W66M");
    }
}