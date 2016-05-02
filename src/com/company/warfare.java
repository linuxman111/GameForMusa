package com.company;


import java.util.HashMap;
import java.util.Map;

public abstract interface warfare {

    Map prepareToFight(HashMap arena);

    HashMap fight(HashMap arena);

    HashMap result(HashMap arena);

    void attack(CharacterPlayer player, Enemies enemy, int x);



}
