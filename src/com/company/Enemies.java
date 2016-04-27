package com.company;


public class Enemies {

        String name, monsterType, weapon, speech;
        int strength, health;


        public Enemies() {

            RandomNumberGenerator rng = new RandomNumberGenerator();

            String[] names = {"Gargamel", "Ogslot", "Blunfder", "Kitten", "Souron", "Poopface", "Gildermish", "Sourbrotton", "Pancea", "Intiminor"};
            name = names[rng.getRandomNumber("enemyObject")];

            String[] monsterTypes = {"Ogre", "Dragon", "WindWisp", "Wispmother", "Bear", "Castle Guard", "Wolf", "Snow Troll", "Troll", "Dragon Priest"};
            monsterType = names[rng.getRandomNumber("enemyObject")];

            String[] weapons = {"Sword", "Hammer Of Naftaly", "Pichfork", "Spear", "Mace", "Bow And Arrow", "Staff Of Destruction", "Fire", "Magic", "Poop"};
            weapon = names[rng.getRandomNumber("enemyObject")];

            String[] speeches = {"Arggg", "Weee", "Bloggl", "Roar", "Gagagaga", "I will kill you", "Hey", "Aaaaaaaaaa", "Sasasas", "Beboop"};

            if (this.monsterType == "Dragon") {

                weapon = "Fire Breath";

            } else {

                speech = names[rng.getRandomNumber("enemyObject")];

            }

            strength = rng.getRandomNumber("playerStats");

            health = rng.getRandomNumber("playerStats");


        }








}
