package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class GetUserInputTest {

    GetUserInput gui = new GetUserInput();

    @Test
    public void testAskAQuestion() throws Exception {

        System.out.println("Starting askAQuestion method test");

        Assert.assertNotNull(gui);

        //String question = gui.askAQuestion("This is a test string from junit");

        //Assert.assertNotNull(question);

        //Assert.assertEquals(question, "This is a test string from junit");

        System.out.println("Completed askAQuestion method test");

    }

    @Test
    public void testAskAQuestion1() throws Exception {

    }

    @Test
    public void testSaySomethingNoReturn() throws Exception {

        System.out.println("Starting saySomethingNoReturn method test");

        Assert.assertNotNull(gui);

        String question = gui.saySomethingNoReturn("This is a test string from junit");

        Assert.assertNotNull(question);

        Assert.assertEquals(question, "This is a test string from junit");

        System.out.println("Completed saySomethingNoReturn method test");

    }

    @Test
    public void testSaySomethingNoReturn1() throws Exception {

    }
}