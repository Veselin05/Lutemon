package com.example.lutemon;

public class BlackLutemon extends Lutemon{
    public BlackLutemon(String name, String location) {
        super(name, "Black", location);
    }
    //Black lutemon takes less damage
    @Override
    public void takeDamage(int amount) {
        super.takeDamage(amount/2);
    }
}
