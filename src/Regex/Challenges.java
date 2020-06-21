package Regex;

public class Challenges {
    public static void main(String[] args) {
        /**
         * Write the string literal regex that will match the following String.
         * use the String.matches() method to verify your answer.
         */
//        String challenge1 ="I want a bike";
//        System.out.println((challenge1.matches("I want a bike")));

        /**
         * Write a regex that will match "I want a bike" and "I want a ball".
         * Verify your answer using matches() method.
         */
        String challenge1 ="I want a bike";
        String challenge2 = "I want a ball";
//        String regExp = "I want a (bike|ball)";
//        System.out.println(challenge1.matches(regExp));  // output: true
//        System.out.println(challenge2.matches(regExp));  // output: true
        // OR
        String regExp = "I want a \\w+";
        System.out.println(challenge1.matches(regExp));  //true
        System.out.println(challenge2.matches(regExp));  // true

    }
}
