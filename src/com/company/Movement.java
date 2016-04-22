package com.company;


public class Movement {

    String[] movingAround = new String[10];
    String[] encounter = new String[10];
    RandomNumberGenerator rng = new RandomNumberGenerator();
    GetUserInput gui = new GetUserInput();

    public Movement() {


        movingAround[0] = "You are walking along the forest 0";
        movingAround[1] = "You are walking along the forest 1";
        movingAround[2] = "You are walking along the forest 2";
        movingAround[3] = "You are walking along the forest 3";
        movingAround[4] = "You are walking along the forest 4";
        movingAround[5] = "You are walking along the forest 5";
        movingAround[6] = "You are walking along the forest 6";
        movingAround[7] = "You are walking along the forest 7";
        movingAround[8] = "You are walking along the forest 8";
        movingAround[9] = "You are walking along the forest 9";


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
