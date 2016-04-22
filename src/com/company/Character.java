package com.company;


public class Character {

    RandomNumberGenerator rng = new RandomNumberGenerator();



    private String name, weapon;
    private boolean isAlive = true;
    private int strength, health;




    public Character() {

        strength = rng.getRandomNumber("playerStats");
        health = rng.getRandomNumber("playerStats");

    }


    public void testCharacter() {

        System.out.println(strength + " " + health);

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
