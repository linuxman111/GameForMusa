package com.company;

import java.util.Random;


public class RandomNumberGenerator {

    Random randNum = new Random();

    int result;


    public int getRandomNumber(String x) {

        if (x == "playerStats") {

            result = randNum.nextInt(90) + 10;

        } else if (x == "movement") {

            result = randNum.nextInt(9) + 1;

        } else if (x == "enemyObject") {

            result = randNum.nextInt(9) + 1;

        } else if (x == "flipacoin") {

            result = randNum.nextInt(2);

        } else if (x == "battle") {

            result = randNum.nextInt(9) + 1;

        }

        return result;

    }




}
