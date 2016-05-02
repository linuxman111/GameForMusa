package com.company;

import java.util.Scanner;


public class GetUserInput {

    Scanner input = new Scanner(System.in);


        public String askAQuestion(String q) {

            System.out.println(q);

            String answer = input.next();

            return answer.toUpperCase();

        }

        public int askAQuestion(int q) {

            int answer = input.nextInt(0);

            return answer;

        }

        public String saySomethingNoReturn(String s) {

            System.out.println(s);

            return s;

        }

        public void saySomethingNoReturn(int s) {

            System.out.println(s);

        }


}
