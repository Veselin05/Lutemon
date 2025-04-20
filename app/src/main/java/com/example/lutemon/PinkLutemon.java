package com.example.lutemon;

public class PinkLutemon extends Lutemon {
    public PinkLutemon(String name, String location) {

        super(name,3,1,10, "Pink", location);
    }
    //Pink Lutemon has more attack power
    @Override
    public int attack() {
        return super.attack + 5;
    }
}
