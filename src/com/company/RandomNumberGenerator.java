package com.company;

import java.util.Random;

/**
 * Created by ArthRu on 4/14/2016.
 */
public class RandomNumberGenerator {

    Random randNum = new Random();

    int result;
    public static int token = 45443;


    public int getRandomNumber(String x) {

        if (x == "playerStats") {

            result = randNum.nextInt(90) + 10;

        } else if (x == "movement") {

            result = randNum.nextInt(9) + 1;

        } else if (x == "enemyObject") {

            result = randNum.nextInt(9) + 1;

        }

        return result;

    }




}
