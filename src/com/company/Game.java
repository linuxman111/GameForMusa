package com.company;


import org.apache.poi.ss.usermodel.Row;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ArthRu on 4/14/2016.
 */
public class Game {


    GetUserInput getInput = new GetUserInput();
    Movement moving = new Movement();
    Battle battle = new Battle();

    boolean counter = false;


    public void start() {

        getInput.saySomethingNoReturn("Welcome to the land of Nod, where many fighters come to fight and die");

        initialStart();

    }

    public void initialStart() {

        counter = false;

        while (counter == false) {

            String menuAnswer = getInput.askAQuestion("(R)estore Game       (S)tart New Game      (Q)uit        (C)reate Spreadsheet");

            if (menuAnswer.equals("R")) {

                restoreGame();

            } else if (menuAnswer.equals("S")) {

                startGame();

            } else if (menuAnswer.equals("Q")) {

                System.exit(0);

            } else if (menuAnswer.equals("C")) {

                createSpreadsheet();


            } else {

                getInput.saySomethingNoReturn("I Didn't Understand Your Input");
                getInput.saySomethingNoReturn("Try Again");
                initialStart();

            }

        }

    }

    public void startGame() {

        counter = false;

        CharacterPlayer player = new CharacterPlayer();

        player.setName(getInput.askAQuestion("What would you like your name to be?"));
        player.setWeapon(getInput.askAQuestion("What kind of weapon would you like?"));

        getInput.saySomethingNoReturn("Here is your character: ");
        getInput.saySomethingNoReturn("Your name is: " + player.getName());
        getInput.saySomethingNoReturn("Your weapon is: " + player.getWeapon());
        getInput.saySomethingNoReturn("Your health is: " + player.getHealth());
        getInput.saySomethingNoReturn("Your strength is: " + player.getStrength());


        //String answer = getInput.askAQuestion("Are you happy with your character or would you like to reroll? Y or N");

        while (counter ==  false) {

            String answer = getInput.askAQuestion("Are you happy with your character or would you like to reroll? Y or N");

                if (answer.equals("Y")) {

                    counter = true;
                    playGame(player);

                } else if (answer.equals("N")) {

                    counter = true;
                    startGame();

                }

        }


    }

    public void restoreGame() {



    }


    public void playGame(CharacterPlayer player) {

        counter = false;

        Enemies enemy = moving.getEnemy();

        moving.getMoving();

        moving.getEncounter(enemy);

        while (counter == false) {

            String answer = getInput.askAQuestion("Would you like to (R)un or (F)ight?");

            if (answer.equals("R")) {

                counter = true;

                getInput.saySomethingNoReturn("You run like a little baby.");

                getInput.saySomethingNoReturn("Your total wins so far are: " + player.getWins());

                playGame(player);

            } else if (answer.equals("F")) {

                counter = true;



                fight(player, enemy);

            }

        }

    }


    public CharacterPlayer fight(CharacterPlayer player, Enemies enemy) {

            boolean isEnemyDead = false;

            HashMap<String, Character> arena = new HashMap<>();

            arena.put("player", player);

            arena.put("enemy", enemy);


            while (isEnemyDead == false) {

                battle.prepareToFight(arena);

                battle.fight(arena);

                battle.result(arena);

                if (enemy.isAlive == true) {



                }

            }

            return player;

    }


    public void createSpreadsheet() {


            ProcessExcel pe = new ProcessExcel();


            Map<Integer, String> data = new HashMap<>();

            //data.put("1", new Object[] {"ID", "Name", "LastName"});
            //data.put("2", new Object[] {"4556", "Art", "Rumrill"});
            //data.put("3", new Object[] {"4534", "fdadfa", "jadaf"});
            //data.put("4", new Object[] {"45665365", "yrasf", "klkhs"});
            //data.put("5", new Object[] {"322433", "ggeser", "nnnmhgrt"});

            data.put(1, "Art");
            data.put(2, "Eunice");
            data.put(3, "Jinnah");
            data.put(4, "Hannah");
            data.put(5, "Musa");

            String filename = pe.createWorkbook("newFile.xls", data);

            getInput.saySomethingNoReturn("The file" + filename + " has been created.");

            //Read the created file
            pe.readWorkbook();

            System.exit(0);


    }


}

