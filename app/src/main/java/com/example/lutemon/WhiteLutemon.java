package com.example.lutemon;

public class WhiteLutemon extends Lutemon {
    public WhiteLutemon(String name, String location) {
       super(name, "White", location);
    }
    //White Lutemon has more health
    @Override
    public void restoreHealth() {
        super.restoreHealth();
        this.health = super.maxHealth + 10;
    }
}
