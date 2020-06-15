package Regex;

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



    }
}
