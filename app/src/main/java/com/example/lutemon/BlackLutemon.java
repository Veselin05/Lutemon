package com.example.lutemon;

public class BlackLutemon extends Lutemon {
    public BlackLutemon(String name, String location) {
        super(name,3,1,10, "Black", location);
    }

    @Override
    public void takeDamage(int amount) {
        super.takeDamage(amount / 2);
    }
}
