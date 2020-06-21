package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        /**
         * CHALLENGE 3
         * In the last challenge , we used the same regular expression twice .
         * Use the Matcher.matches() method to check  for the matches , instead  of String.matches() , for the regex that uses \w+.
         * Hint:You will have to compile a pattern
         */

        String regExp3 = "I want a \\w+";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);  //true
        System.out.println(matcher.matches());  //true

        /**
         * CHALLENGE 4
         * Replace all occurrences of blank  with an underscore for the following String
         * Print out the resulting String
         */
        String challenge4 = "The place all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ","_"));  // The_place_all_blanks_with_underscores
        System.out.println(challenge4.replaceAll("\\s","_")); //The_place_all_blanks_with_underscores

        /**
         * CHALLENGE 5
         * Write a regex expression that will match the following String in its entirety.
         * String challenge5 = "aaabccccccccdddefffg"
         * Use the following String.matches() method to verify your answer.
         *
         */
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdef]+"));  //false
        System.out.println(challenge5.matches("[a-g]+"));    // true

        /**
         * CHALLENGE 6
         * Write a regex that will only match challenge5 string int its entirety
         */
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$")); // true
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));  //REPLACED

        /**
         * CHALLENGE 7
         * Write a regex that will match a string that starts with a series of letters.
         * The letters must be followed by a period.After the period, there must be a series of digits.
         * The string "kjist.22" would match .
         * The String "f5.12a" would'nt match
         * Use this String to test your regex --> String challenge7 = "abcd.135"
         */
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-Z a-z]+\\.\\d+$"));  // true

        /**
         * CHALLENGE 8
         * Modify the regex in challenge7 to use a group,
         * so that we can print all the digits that occur in a string that contains multiple occurrences of the pattern .
         * Write all the code required to accomplish this (create a pattern and matcher, etc)
         * Use the following string to test your code.
         */
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 =Pattern.compile("[A-Z a-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println("Occurrences :"+matcher8.group(1));  //Occurrences :135
                                                                    //Occurrences :7
                                                                    //Occurrences :999
        }


    }
}
