package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Battle implements warfare {

    GetUserInput gui = new GetUserInput();
    RandomNumberGenerator rng = new RandomNumberGenerator();


    public Map<String, Character> prepareToFight(HashMap arena) {

        Character player = (CharacterPlayer) arena.get("player");
        Character enemy = (Enemies) arena.get("enemy");

        gui.saySomethingNoReturn("You face your enemy on the field of battle.");
        gui.saySomethingNoReturn("");
        gui.saySomethingNoReturn("Your strength is " + player.getStrength() + " and your health is " + player.getHealth());
        gui.saySomethingNoReturn("");
        gui.saySomethingNoReturn(enemy.getName() + " strength is " + enemy.getStrength() + " and its health is " + enemy.getHealth());

        arena.clear();

        arena.put("player", player);
        arena.put("enemy", enemy);

        return arena;
    }


    public HashMap<String, Character> fight(HashMap arena) {

        CharacterPlayer player = (CharacterPlayer) arena.get("player");
        Enemies enemy = (Enemies) arena.get("enemy");
        String whogoesfirst;
        String result;


        int cointoss = rng.getRandomNumber("flipacoin");

        if (cointoss == 1) {

            whogoesfirst = "player";

        } else {

            whogoesfirst = "enemy";

        }

        gui.saySomethingNoReturn("Coin toss was " + cointoss + ".  " + whogoesfirst + " goes first");

        if (whogoesfirst == "player") {

            result = attack(player, enemy, 1);


        } else {

            result = attack(player, enemy, 0);


        }

        if (result == "playerIsDead") {

            System.out.println("Player Died");

        } else {

            System.out.println("Enemy Died");
            player.setWins(player.getWins() + 1);

            System.out.println(player.getHealth());
            System.out.println(player.getStrength());
            System.out.println(player.getWins());

        }

        return arena;
    }


    public HashMap<String, Character> result(HashMap arena) {

        return arena;

    }


    public String attack(CharacterPlayer player, Enemies enemy, int x) {

        int cointoss = x;
        int hitpoints;

        while (player.getIsAlive() && enemy.getIsAlive()) {

            if (cointoss == 1) {

                //Player hits
                hitpoints = rng.getRandomNumber("battle");

                gui.saySomethingNoReturn(player.getName() + " attacks. " + player.getName() + " does " + hitpoints + " damage to " + enemy.getName());

                enemy.setHealthBattle(hitpoints);

                hitpoints = 0;


                //Enemy hits
                hitpoints = rng.getRandomNumber("battle");

                gui.saySomethingNoReturn(enemy.getName() + " attacks now." + enemy.getName() + " does " + hitpoints + " damage to " + player.getName());

                player.setHealthBattle(hitpoints);

                hitpoints = 0;


            } else {

                //Enemy hits
                hitpoints = rng.getRandomNumber("battle");

                gui.saySomethingNoReturn(enemy.getName() + " attacks. " + enemy.getName() + " does " + hitpoints + " damage to " + player.getName());

                player.setHealthBattle(hitpoints);

                hitpoints = 0;


                //Player hits
                hitpoints = rng.getRandomNumber("battle");

                gui.saySomethingNoReturn(player.getName() + " attacks now. " + player.getName() + " does " + hitpoints + " damage to " + enemy.getName());

                enemy.setHealthBattle(hitpoints);

                hitpoints = 0;


            }


        }

        if (player.getIsAlive() == false) {

            return "playerIsDead";

        } else {

            return "enemyIsDead";

        }


    }

}
