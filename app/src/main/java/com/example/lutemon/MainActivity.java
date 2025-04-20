package com.example.lutemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button createLutemonButton, trainLutemonButton, battleButton, viewLutemonsButton, storageButton, trainingAreaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createLutemonButton = findViewById(R.id.createLutemonButton);
        trainLutemonButton = findViewById(R.id.trainLutemonButton);
        battleButton = findViewById(R.id.battleButton);
        viewLutemonsButton = findViewById(R.id.viewLutemonsButton);
        storageButton = findViewById(R.id.storageButton);
        trainingAreaButton = findViewById(R.id.trainingAreaButton);

        createLutemonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CreateLutemonActivity.class);
            startActivity(intent);
        });

        trainLutemonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TrainingAreaActivity.class);
            startActivity(intent);
        });

        battleButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BattleActivity.class);
            startActivity(intent);
        });

        viewLutemonsButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ViewLutemonsActivity.class);
            startActivity(intent);
        });

        storageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LutemonStorageActivity.class);
            startActivity(intent);
        });

        trainingAreaButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TrainingAreaActivity.class);
            startActivity(intent);
        });
    }
}