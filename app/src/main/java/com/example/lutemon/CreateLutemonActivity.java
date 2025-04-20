package com.example.lutemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreateLutemonActivity extends AppCompatActivity {

    private RadioGroup lutemonTypeRadioGroup;
    private EditText lutemonNameEditText;
    private LutemonStorage lutemonStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_lutemon);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the Up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lutemonTypeRadioGroup = findViewById(R.id.lutemonTypeRadioGroup);
        lutemonNameEditText = findViewById(R.id.lutemonNameEditText);
        lutemonStorage = LutemonStorage.getInstance();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Handle the Up button press
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCreateClicked(View view) {
        int selectedId = lutemonTypeRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton != null) {
            String selectedType = selectedRadioButton.getText().toString();
            String lutemonName = lutemonNameEditText.getText().toString().trim();

            if (lutemonName.isEmpty()) {
                Toast.makeText(this, "Please enter a name for your Lutemon.", Toast.LENGTH_SHORT).show();
                return;
            }

            createLutemon(selectedType, lutemonName);
            Toast.makeText(this, lutemonName + " the " + selectedType + " Lutemon created!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Please select a Lutemon type", Toast.LENGTH_SHORT).show();
        }
    }

    private void createLutemon(String type, String name) {
        Lutemon newLutemon = null;
        switch (type) {
            case "White":
                newLutemon = new WhiteLutemon(name, "Home");
                break;
            case "Green":
                newLutemon = new GreenLutemon(name, "Home");
                break;
            case "Pink":
                newLutemon = new PinkLutemon(name, "Home");
                break;
            case "Orange":
                newLutemon = new OrangeLutemon(name, "Home");
                break;
            case "Black":
                newLutemon = new BlackLutemon(name, "Home");
                break;
        }
        lutemonStorage.addLutemon(newLutemon);
    }
}