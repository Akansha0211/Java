package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {
    public static void main(String[] args) {
//        String string ="I   am String, Yes I am";
//        System.out.println(string);
//        String yourString = string.replaceAll("I ","You");   // output : You  am String, Yes Youam
//        System.out.println(yourString);

//        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(alphanumeric.replaceAll(".","X"));   // output : XXXXXXXXXXXXXXXXXXXXXXX

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl999z";
        //Replaces each occurence of "abcDeee"
        System.out.println(secondString.replaceAll("abcDeee","YYY"));  // output : YYYF12GhhYYYiiiijkl999z
        //replaces first occurrence of "abcDeee"
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));  // output : YYYF12GhhabcDeeeiiiijkl999z

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.matches("^hello"));  // output : false
        System.out.println(alphanumeric.matches("^abcDeee"));  // output : false

        //entire string should match
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));  // output : true
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));  // output :true
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));
        System.out.println(alphanumeric.replaceAll("ijkl99z","THE END"));


        //Character class (in square braces)
        //replace every occurrence of a, e, i
        System.out.println(alphanumeric.replaceAll("[aei]","X")); //output :XbcDXXXF12GhhXXXXjkl99z
        //replace every all others except a, e, i
        System.out.println(alphanumeric.replaceAll("[^aei]","X"));//output :aXXXeeeXXXXXXiiiiXXXXXX

        System.out.println(alphanumeric.replaceAll("[aei]","I replaced a letter here"));

        //replace each occurrence of a, e, i followed by f , j  by X
        // regex is case sensitive
        System.out.println(alphanumeric.replaceAll("[aei][fj]","X")); //output :abcDeeeF12GhhiiiXkl99z

        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String newAplhanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAplhanumeric.replaceAll("[^ej]","X")); // output :XXXXeeeXXXXXXXXXXjXXXXX
        //regex is case sensitive
        //as you can observe that "D" is not replaced here
        System.out.println(newAplhanumeric.replaceAll("[abcdef345678]","X"));  // output :XXXDXXXF12Ghhiiiijkl99z

        System.out.println(newAplhanumeric.replaceAll("[a-f 3-8]","X"));  // output: XXXDXXXF12Ghhiiiijkl99z
        System.out.println(newAplhanumeric.replaceAll("[a-f A-f 3-8]","X")); // output :XXXXXXXX12Xhhiiiijkl99z

        //turn off case sensitivity
        System.out.println(newAplhanumeric.replaceAll("(?i)[a-f 3-8]","X"));  //output :XXXXXXXX12Ghhiiiijkl99z

        System.out.println(newAplhanumeric.replaceAll("\\d","X"));  //  output :abcDeeeFXXGhhiiiijklXXz
        System.out.println(newAplhanumeric.replaceAll("\\D","X")); // output :XXXXXXXX12XXXXXXXXXX99X

        String hasWhitespace = "I have blanks and \t a tab and also \n a new line";
        System.out.println(hasWhitespace);
        //output:
//        I have blanks and 	 a tab and also
//        a new line

        //remove all white spaces
        System.out.println(hasWhitespace.replaceAll("\\s","")); // output :Ihaveblanksandatabandalsoanewline
        //remove a specific whitespace (here it is tab)
        System.out.println(hasWhitespace.replaceAll("\t","X"));
        //output :
//        I have blanks and X a tab and also
//        a new line

        //will replace all except whitespace(only spaces ,tab  and new line character remains)
        System.out.println(hasWhitespace.replaceAll("\\S","X"));
        //output :
//        X XXXX XXXXXX XXX 	 X XXX XXX XXXX
//        X XXX XXXX

        //w character class matches a-z , A-Z and 0-9
        System.out.println(newAplhanumeric.replaceAll("\\w","X"));  //output :XXXXXXXXXXXXXXXXXXXXXXX

//        replaces everything except whitespace
        System.out.println(hasWhitespace.replaceAll("\\w","X"));

        //surround each word with replacement string X
        System.out.println(hasWhitespace.replaceAll("\\b","X"));
        //output:
//        XIX XhaveX XblanksX XandX 	 XaX XtabX XandX XalsoX
//        XaX XnewX XlineX

        //Quantifiers
        //quantifiers specify how often an element occurs in a regex.
        String thirdAplhanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAplhanumeric.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdAplhanumeric.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdAplhanumeric.replaceAll("^abcDe*","YYY"));
        //now you can remove e and check the above * as well you will get the same result

        //will replace e's in between 2 to 5 i.e occuring 2 to 5 times
        //  will replace only first occurrence
        System.out.println(thirdAplhanumeric.replaceAll("^abcDe{2,5}","YYY"));
        //will replace h followed by any number of i and atleast one j
        System.out.println(thirdAplhanumeric.replaceAll("h+i*j","Y"));  //output :abcDeeeF12GYkl99z


       //pattern.compile method --> compile regex into a pattern.Used when we want to work  with methods in the matcher class .
        //matches work with classes that implement char sequence interface with string , string buffer , and other classes  that implement that interface.
        //Generally  we use matcher when we want to find multiple occurrences of pattern or we want same pattern with multiple sequences.

        StringBuilder htmlText = new StringBuilder("<h1>My heading </h1>");
        htmlText.append("<h2>Sub heading </h2>");
        htmlText.append("<p>This is paragraph about something </p>");
        htmlText.append("<p>This is another paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>There is summary</p> ");

//        String h2Pattern = ".*<h2>.*";  // regex string

//        Pattern pattern = Pattern.compile(h2Pattern); // create pattern instance which will be used to create matcher instance
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches());

//        String h2Pattern = "<h2>";
//        Pattern pattern = Pattern.compile(h2Pattern);
//        Matcher matcher = pattern.matcher(htmlText); // another instance of Matcher class
//        //System.out.println(matcher.matches());   // false
//        matcher.reset();
//        int count = 0;
//        while(matcher.find()){
//            count++;
//            System.out.println("Occurrence "+ count + ":"+matcher.start() +" to "+matcher.end());  //Occurrence 1:20 to 24
//                                                                                                    //Occurrence 2:114 to 118
//        }

//        String h2GroupPattern ="(<h2>)";
//        Pattern pattern = Pattern.compile(h2GroupPattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches()); // false
//        matcher.reset();
//        while (matcher.find()){
//            System.out.println("Occurrence:"+ matcher.group(1));  //Occurrence:<h2>
//                                                                 //Occurrence:<h2>
//        }

//        String h2GroupPattern ="(<h2>.*</h2>)";  // * is Greedy Quantifier (Concept of Greedy Vs Reluctant(lazy) Quantifier) whereas + is reluctant quantifier
//        //Regex has grabbed everything from opening tag of one h2 to closing tag of second h2
//        Pattern pattern = Pattern.compile(h2GroupPattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches()); // false
//        matcher.reset();
//        while (matcher.find()){
//            System.out.println("Occurrence:"+ matcher.group(1)); //Occurrence:<h2>Sub heading </h2><p>This is paragraph about something </p><p>This is another paragraph</p><h2>Summary</h2>
//
//        }

//        String h2GroupPattern ="(<h2>.*?</h2>)";  // * is Greedy Quantifier (Concept of Greedy Vs Reluctant(lazy) Quantifier) whereas + is reluctant quantifier
//        //Regex has grabbed everything from opening tag of one h2 to closing tag of second h2
//        Pattern pattern = Pattern.compile(h2GroupPattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches()); // false
//        matcher.reset();
//        while (matcher.find()){
//            System.out.println("Occurrence:"+ matcher.group(1));  // Occurrence:<h2>Sub heading </h2>
//                                                                    //Occurrence:<h2>Summary</h2>
//        }


//        String h2GroupPattern ="(<h2>.+?</h2>)";  // * is Greedy Quantifier (Concept of Greedy Vs Reluctant(lazy) Quantifier) whereas + is reluctant quantifier
//        //Regex has grabbed everything from opening tag of one h2 to closing tag of second h2
//        Pattern pattern = Pattern.compile(h2GroupPattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches()); // false
//        matcher.reset();
//        while (matcher.find()){
//            System.out.println("Occurrence:"+ matcher.group(1));
//    //            Occurrence:<h2>Sub heading </h2>
//    //            Occurrence:<h2>Summary</h2>
//        }


//        String h2GroupPattern ="(<h2>)(.+?)(</h2>)";  // * is Greedy Quantifier (Concept of Greedy Vs Reluctant(lazy) Quantifier) whereas + is reluctant quantifier
//        //Regex has grabbed everything from opening tag of one h2 to closing tag of second h2
//        Pattern pattern = Pattern.compile(h2GroupPattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches()); // false
//        matcher.reset();
//        while (matcher.find()){
//            System.out.println("Occurrence:"+ matcher.group(2));
//     //            Occurrence:Sub heading
//     //            Occurrence:Summary
//        }


        //AND , OR , NOT operators in regex
        //"abc"  -->  "a" and "b"  and "c"
        // [Hh]arry  <-- OR is used here  --> [H|h]arry
        // Both are same (above case)
        //[^abc]  <-- NOT is used here(when it is first character within square braces)

        //All occurrences of t not followed by v
//        String tvTest ="tstvtkt";
//        String tNotVRegex = "t[^v]";
//        //above regex will not count the last t in the string tvTest (as it is not followed by any character and for this regx t match there should be atleast one character after t)
//        Pattern pattern = Pattern.compile(tNotVRegex);
//        Matcher matcher = pattern.matcher(tvTest);
//        int count = 0;
//        while (matcher.find()){
//            count++;
//            System.out.println("Occurrence "+count+" : "+matcher.start()+" to "+matcher.end());//Occurrence 1 : 0 to 2
//                                                                                               //Occurrence 2 : 4 to 6
//        }

//        String tvTest ="tstvtkt";
//        String tNotVRegex = "t(?!v)"; // but this regex will count all t not followed by v including the last t
//        Pattern pattern = Pattern.compile(tNotVRegex);
//        Matcher matcher = pattern.matcher(tvTest);
//        int count = 0;
//        while (matcher.find()){
//            count++;
//            System.out.println("Occurrence "+count+" : "+matcher.start()+" to "+matcher.end());  //Occurrence 1 : 0 to 1
//                                                                                                 //Occurrence 2 : 4 to 5
//                                                                                                 //Occurrence 3 : 6 to 7
//        }


        //MATCH THE PHONE NUMBER
        // "^([\(]{1}[0-9]{3}[\)]{1}[0-9]{3}[\-]{1}[0-9]{4}$ )"

//        String phone1 = "1234567890";  // should'nt match
//        String phone2 = "(123) 456-7890"; // will match
//        String regex = "^[\(]{1}[0-9]{3}[\)]{1}[0-9]{3}[\-]{1}[0-9]{4}$]";  // ERROR


    }
}
