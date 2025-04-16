package com.example.lutemon;

public class GreenLutemon extends Lutemon{
    public GreenLutemon(String name, String location) {
        super(name, "Green", location);
    }
    //Green Lutemon gains more experience
    @Override
    public void gainExperience() {
        super.gainExperience();
        this.experience += 2;
    }
}
