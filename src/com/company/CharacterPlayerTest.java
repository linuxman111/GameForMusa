package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CharacterPlayerTest {

    CharacterPlayer cp = new CharacterPlayer();

    @Test
    public void testGetWins() throws Exception {

        System.out.println("Entering CharacterPlayer test");

        int wins = cp.getWins();

        Assert.assertNotNull(cp);

        Assert.assertEquals(wins, 0);

        System.out.println("Completed CharacterPlayer test");

    }
}