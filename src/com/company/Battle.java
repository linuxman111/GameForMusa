package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Battle {

        GetUserInput gui = new GetUserInput();
        RandomNumberGenerator rng = new RandomNumberGenerator();


        public Map<String, Character> prepareToFight(HashMap arena) {

            Character player = (CharacterPlayer) arena.get("player");
            Character enemy = (Enemies) arena.get("enemy");

            gui.saySomethingNoReturn("You face your enemy on the field of battle.");
            gui.saySomethingNoReturn("");
            gui.saySomethingNoReturn("Your strength is " + player.getStrength() + " and your health is " + player.getHealth());
            gui.saySomethingNoReturn("");
            gui.saySomethingNoReturn(enemy.getName() + " strength is " + enemy.getStrength() + " and your health is " + enemy.getHealth());

            arena.clear();

            arena.put("player", player);
            arena.put("enemy", enemy);

            return arena;
        }



        public HashMap<String, Character> fight(HashMap arena) {

            Character player = (CharacterPlayer) arena.get("player");
            Character enemy = (Enemies) arena.get("enemy");

            //Determine if player or enemy goes first
            int cointoss = rng.getRandomNumber("flipacoin");
            gui.saySomethingNoReturn("Coin toss was " + cointoss);

            if (cointoss == 0) {

                gui.saySomethingNoReturn("Player goes first");

            } else if (cointoss == 1) {

                gui.saySomethingNoReturn("Your enemy goes first");


            }






            return arena;
        }



        public HashMap<String, Character> result(HashMap arena) {



            return arena;
        }




}
