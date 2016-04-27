package com.company;


public class Movement {

    private String[] movingAround = new String[10];
    private Enemies[] enemy = new Enemies[10];
    RandomNumberGenerator rng = new RandomNumberGenerator();
    GetUserInput gui = new GetUserInput();


    public Movement() {

        movingAround[0] = "You are walking along a dark scary forest";
        movingAround[1] = "walking past a large tree";
        movingAround[2] = "Following a trail through a small field";
        movingAround[3] = "Following a river";
        movingAround[4] = "Taking a nap in the shade";
        movingAround[5] = "Trying to find something to eat";
        movingAround[6] = "While looking around for a place to camp for the night";
        movingAround[7] = "Standing under a tree eating lunch";
        movingAround[8] = "While hunting a wild cow";
        movingAround[9] = "While contently sitting next to a pond trying to catch a fish";


        enemy[0] = new Enemies();
        enemy[1] = new Enemies();
        enemy[2] = new Enemies();
        enemy[3] = new Enemies();
        enemy[4] = new Enemies();
        enemy[5] = new Enemies();
        enemy[6] = new Enemies();
        enemy[7] = new Enemies();
        enemy[8] = new Enemies();
        enemy[9] = new Enemies();


    }

    public Enemies getEnemy() {

        return enemy[rng.getRandomNumber("movement")];

    }

    public void getMoving() {

        gui.saySomethingNoReturn(movingAround[rng.getRandomNumber("movement")]);


    }


    public void getEncounter(Enemies enemy) {

        int randomNumber = rng.getRandomNumber("movement");

        gui.saySomethingNoReturn("You come across a " + enemy.monsterType + " with a fierce " + enemy.weapon + " yelling " + enemy.speech);


    }




}
