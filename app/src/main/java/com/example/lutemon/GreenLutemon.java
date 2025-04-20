package com.example.lutemon;

public class GreenLutemon extends Lutemon {
    public GreenLutemon(String name, String location) {
        super(name, 3, 1, 10, "Green", location); // Example values for attack, defense, and health
    }

    @Override
    public void gainExperience() {
        super.gainExperience(2);
        this.experience += 2;
    }
}