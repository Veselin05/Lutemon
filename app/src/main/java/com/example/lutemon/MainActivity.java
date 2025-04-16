package com.example.lutemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button createLutemonButton, trainLutemonButton, battleButton, viewLutemonsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        createLutemonButton = findViewById(R.id.createLutemonButton);
        trainLutemonButton = findViewById(R.id.trainLutemonButton);
        battleButton = findViewById(R.id.battleButton);
        viewLutemonsButton = findViewById(R.id.viewLutemonsButton);

        // Set click listeners for buttons
        createLutemonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateLutemonActivity.class);
                startActivity(intent);
            }
        });

        trainLutemonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrainLutemonActivity.class);
                startActivity(intent);
            }
        });

        battleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BattleActivity.class);
                startActivity(intent);
            }
        });

        viewLutemonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewLutemonsActivity.class);
                startActivity(intent);
            }
        });
    }
}