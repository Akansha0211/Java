package Regex;

public class Basics {
    public static void main(String[] args) {
        String string ="I   am String, Yes I am";
        System.out.println(string);
        String yourString = string.replaceAll("I ","You");
        System.out.println(yourString);
    }
}
