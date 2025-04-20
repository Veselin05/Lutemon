// Lutemon.java
package com.example.lutemon;

import java.util.Random;

public class Lutemon {
    protected String name;
    protected int attack;
    protected int defense;
    protected int health;
    protected int experience;
    protected int id;
    protected static int nextId = 1;
    protected String color;
    protected int maxHealth; // Added for healing
    protected String location; // Added location

    public Lutemon(String name, int attack, int defense, int health, String color) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.experience = 0;
        this.id = nextId++;
        this.color = color;
        this.maxHealth = health;
    }

    public Lutemon(String name, int attack, int defense, int health, String color, String location) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.experience = 0;
        this.id = nextId++;
        this.color = color;
        this.maxHealth = health;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public int attack() {
        Random random = new Random();
        return attack + random.nextInt(attack / 2 + 1);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void gainExperience(int amount) {
        this.experience += amount;
        levelUp();
    }

    private void levelUp() {
        if (this.experience >= 100) {
            this.attack += 1;
            this.defense += 1;
            this.maxHealth += 10;
            this.health = this.maxHealth;
            this.experience -= 100;
        }
    }

    public void heal() {
        this.health = this.maxHealth;
    }

    public Lutemon defend(Lutemon opponent) {
        opponent.takeDamage(this.defense);
        return opponent;
    }

    // Added getLocation() method
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void train() {
        Random random = new Random();
        this.attack += random.nextInt(3) + 1;
        this.defense += random.nextInt(3) + 1;
        this.experience += 10;
        levelUp();
    }

    @Override
    public String toString() {
        return color + " " + name + " (Attack: " + attack + ", Defense: " + defense + ", Health: " + health + ", Experience: " + experience + ")";
    }

    public void gainExperience() {

    }
}
