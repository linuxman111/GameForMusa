package com.company;


public class Movement {

    static String[] movingAround = new String[10];
    static String[] encounter = new String[10];
    RandomNumberGenerator rng = new RandomNumberGenerator();
    GetUserInput gui = new GetUserInput();

    static {
        
        movingAround[0] = "You are walking along a dark scary forest";
        movingAround[1] = "walking past a large tree";
        movingAround[2] = "Following a trail through a small field";
        movingAround[3] = "Following a river";
        movingAround[4] = "Taking a nap in the shade";
        movingAround[5] = "Trying to find something to eat";
        movingAround[6] = "While looking around for a place to camp for the night";
        movingAround[7] = "Standing under a tree eating lunch";
        movingAround[8] = "Whilehunting a while cow";
        movingAround[9] = "While contently sitting next to a pond trying to catch a fish";


        encounter[0] = "An evil guy attacks 0";
        encounter[1] = "An evil guy attacks 1";
        encounter[2] = "An evil guy attacks 2";
        encounter[3] = "An evil guy attacks 3";
        encounter[4] = "An evil guy attacks 4";
        encounter[5] = "An evil guy attacks 5";
        encounter[6] = "An evil guy attacks 6";
        encounter[7] = "An evil guy attacks 7";
        encounter[8] = "An evil guy attacks 8";
        encounter[9] = "An evil guy attacks 9";

    }

    public void getMoving() {

        gui.saySomethingNoReturn(movingAround[rng.getRandomNumber("movement")]);


    }


    public void getEncounter() {

        gui.saySomethingNoReturn(encounter[rng.getRandomNumber("movement")]);

    }




}
