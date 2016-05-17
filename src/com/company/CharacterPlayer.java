package com.company;

/**
 * Created by ArthRu on 4/22/2016.
 */
public class CharacterPlayer extends Character {

    int wins = 0;

    public CharacterPlayer() {

        health = 1000;
        strength = 1000;

    }


    public int getWins() {

        return this.wins;

    }

    public void setWins(int wins) {

        this.wins = wins;

    }


}
