package com.example.lutemon;

public class WhiteLutemon extends Lutemon {
    public WhiteLutemon(String name, String location) {
        super(name,3,1,10, "White", location);
    }

    @Override
    public void heal() {
        super.heal();
        this.health = this.maxHealth + 10;
    }
}