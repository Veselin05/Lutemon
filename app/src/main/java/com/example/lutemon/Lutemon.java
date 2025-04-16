package com.example.lutemon;
public class Lutemon {
    protected String name;
    protected String color;
    protected int attack;
    protected int defense;
    protected int experience;
    protected int health;
    protected int maxHealth;
    protected int id;
    protected static int idCounter = 0;
    protected String location;


    public Lutemon(String name, String color, String location) {
        this.name = name;
        this.color = color;
        this.health = 100;
        this.maxHealth = 100;
        this.attack = 20;
        this.defense = 10;
        this.experience = 0;
        this.location = location;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //  Methods for training, battling, etc.
    public int attack() {
        return this.attack; // Basic attack
    }

    //Oponents's attqck is reduced by the lutemon's defense
    public Lutemon defend(Lutemon opponent) {
        opponent.takeDamage(this.defense);
        return opponent;
    }

    public static int getNumberOfCreatedLutemons() {
        return idCounter;
    }

    public void restoreHealth() {
        this.health = this.maxHealth;
    }

    public void gainExperience() {
        this.experience++;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }
}