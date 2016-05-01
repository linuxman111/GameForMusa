package com.company;


public class Movement {

    private String[] movingAround;
    private Enemies[] enemy = new Enemies[10];
    RandomNumberGenerator rng = new RandomNumberGenerator();
    GetUserInput gui = new GetUserInput();
    ProcessExcel pe = new ProcessExcel();


    public Movement() {

        movingAround = pe.readWorkbook("movement.xls");


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
