package com.example.lutemon;

public class OrangeLutemon extends Lutemon{
    public OrangeLutemon(String name, String location) {
        super(name, "Orange", location);
    }
    //Orange Lutemon has stronger defense
    @Override
    public Lutemon defend(Lutemon opponent) {
        opponent.takeDamage(this.defense + 5);
        return opponent;
    }
}
