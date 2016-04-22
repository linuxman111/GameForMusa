package com.company;

import java.util.Scanner;


public class GetUserInput {

    Scanner input = new Scanner(System.in);


        public String askAQuestion(String q) {

            System.out.println("Asking this question: " + q);

            String answer = input.next();

            System.out.println("The answer was this: " +  answer);

            System.out.println("Returning this: " + answer.toUpperCase());

            return answer.toUpperCase();

        }

        public int askAQuestion(int q) {

            System.out.println(q);

            int answer = input.nextInt(0);

            return answer;

        }

        public void saySomethingNoReturn(String s) {

            System.out.println(s);

        }

        public void saySomethingNoReturn(int s) {

            System.out.println(s);

        }


}
