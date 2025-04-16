package com.example.lutemon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class CreateLutemonActivity extends AppCompatActivity {
    private RadioGroup lutemonTypeRadioGroup;
    private EditText lutemonNameEditText;
    private String selectedType; // Store the selected Lutemon type
    private String lutemonName;    // Store the Lutemon name
    private LutemonStorage lutemonStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_lutemon);

        lutemonTypeRadioGroup = findViewById(R.id.lutemonTypeRadioGroup);
        lutemonNameEditText = findViewById(R.id.lutemonNameEditText);
        lutemonStorage = LutemonStorage.getInstance(); // Get the singleton instance

    }

    public void onCreateClicked(View view) {
        int selectedId = lutemonTypeRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton != null) {
            selectedType = selectedRadioButton.getText().toString();
            lutemonName = lutemonNameEditText.getText().toString().trim(); // Get name and remove extra spaces

            if (lutemonName.isEmpty()) {
                Toast.makeText(this, "Please enter a name for your Lutemon.", Toast.LENGTH_SHORT).show();
                return; // Stop creation if name is empty
            }
            createLutemon(selectedType, lutemonName);

            Toast.makeText(this, lutemonName + " the " + selectedType + " Lutemon created!", Toast.LENGTH_SHORT).show();
            finish(); // Return to the previous screen (Home)

        } else {
            Toast.makeText(this, "Please select a Lutemon type", Toast.LENGTH_SHORT).show();
        }
    }

    private void createLutemon(String type, String name) {
        Lutemon newLutemon;
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
            default:
                newLutemon = new Lutemon(name, type, "Home"); // corrected
        }
        lutemonStorage.addLutemon(newLutemon); // Add the new Lutemon to storage
    }
}
