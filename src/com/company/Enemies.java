package com.company;


public class Enemies extends Character {

        String monsterType, speech;
        ProcessExcel pe = new ProcessExcel();


        public Enemies() {

            RandomNumberGenerator rng = new RandomNumberGenerator();

            //String[] names = {"Gargamel", "Ogslot", "Blunfder", "Kitten", "Souron", "Poopface", "Gildermish", "Sourbrotton", "Pancea", "Intiminor"};
            String[] names = pe.readWorkbook("names.xls");
            name = names[rng.getRandomNumber("enemyObject")];

            //String[] monsterTypes = {"Ogre", "Dragon", "WindWisp", "Wispmother", "Bear", "Castle Guard", "Wolf", "Snow Troll", "Troll", "Dragon Priest"};
            String[] monsterTypes = pe.readWorkbook("monstertypes.xls");
            monsterType = names[rng.getRandomNumber("enemyObject")];

            //String[] weapons = {"Sword", "Hammer Of Naftaly", "Pichfork", "Spear", "Mace", "Bow And Arrow", "Staff Of Destruction", "Fire", "Magic", "Poop"};
            String[] weapons = pe.readWorkbook("weapons.xls");
            weapon = names[rng.getRandomNumber("enemyObject")];

            //String[] speeches = {"Arggg", "Weee", "Bloggl", "Roar", "Gagagaga", "I will kill you", "Hey", "Aaaaaaaaaa", "Sasasas", "Beboop"};
            String[] speeches = pe.readWorkbook("speech.xls");

            if (this.monsterType == "Dragon") {

                weapon = "Fire Breath";

            } else {

                speech = names[rng.getRandomNumber("enemyObject")];

            }


        }



}
