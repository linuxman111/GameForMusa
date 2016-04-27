package com.company;


public class Character {

    RandomNumberGenerator rng = new RandomNumberGenerator();

    String name, weapon;
    boolean isAlive = true;
    int strength, health;



    public Character() {

        strength = rng.getRandomNumber("playerStats");
        health = rng.getRandomNumber("playerStats");

    }

    public String getName() {

        return this.name;

    }

    public void setName(String x) {

        name = x;

    }

    public String getWeapon() {

        return this.weapon;

    }

    public void setWeapon(String x) {

        weapon = x;

    }

    public boolean getIsAlive() {

        return this.isAlive;

    }

    public void setIsAlive(boolean x) {

        isAlive = x;

    }

    public int getHealth() {

        return this.health;

    }

    public int getStrength() {

        return this.strength;

    }



}
