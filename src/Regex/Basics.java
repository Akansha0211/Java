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


        //Boundary-Matcher class
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



    }
}
