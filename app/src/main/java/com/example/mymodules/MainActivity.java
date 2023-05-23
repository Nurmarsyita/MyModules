package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mymodules.SecondActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewMod1;
    TextView textViewMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMod1 = findViewById(R.id.textViewMod1);
        textViewMod2 = findViewById(R.id.textViewMod2);

        textViewMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);

            }
        });

        textViewMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ModuleCode", "C349");
                startActivity(intent);

            }
        });
    }
}