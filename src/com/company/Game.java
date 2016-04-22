package com.company;


/**
 * Created by ArthRu on 4/14/2016.
 */
public class Game {


    GetUserInput getInput = new GetUserInput();
    Movement moving = new Movement();



    public void start() {

        System.out.println("Starting the game");

        System.out.println("The token is " + RandomNumberGenerator.token);

        initialStart();

    }

    public void initialStart() {

        String menuAnswer = getInput.askAQuestion("(R)estore Game       (S)tart New Game      (Q)uit");

        System.out.println("menuAnswer variable is: " +  menuAnswer);

        if (menuAnswer.equals("R")) {

            restoreGame();

        } else if (menuAnswer.equals("S")) {

            startGame();

        } else if (menuAnswer.equals("Q")) {

            System.exit(0);

        } else {

            getInput.saySomethingNoReturn("I Didn't Understand Your Input");
            getInput.saySomethingNoReturn("Try Again");
            initialStart();

        }

    }

    public void startGame() {


        CharacterPlayer player = new CharacterPlayer();

        player.setName(getInput.askAQuestion("What would you like your name to be?"));
        player.setWeapon(getInput.askAQuestion("What kind of weapon would you like?"));

        getInput.saySomethingNoReturn("Here is your character: ");
        getInput.saySomethingNoReturn("Your name is: " + player.getName());
        getInput.saySomethingNoReturn("Your weapon is: " + player.getWeapon());
        getInput.saySomethingNoReturn("Your health is: " + player.getHealth());
        getInput.saySomethingNoReturn("Your strength is: " + player.getStrength());

        String answer = getInput.askAQuestion("Are you happy with your character or would you like to reroll? Y or N");

        if (answer.equals("Y")) {

            playGame(player);

        } else if (answer.equals("N")) {

            startGame();

        } else {

            getInput.saySomethingNoReturn("I didn't understand your answer.  Lets start over");

            startGame();

        }


    }

    public void restoreGame() {



    }


    public void playGame(CharacterPlayer player) {

        moving.getMoving();

        moving.getEncounter();

        String answer = getInput.askAQuestion("Would you like to (R)un or (F)ight?");

            if (answer.equals("R")) {

                System.out.println("stuff");

            } else if (answer.equals("F")) {

                System.out.println("more stuff");

            } else {

                getInput.saySomethingNoReturn("I'm starting over.  I don't like your input");

                playGame(player);

            }


    }


}

