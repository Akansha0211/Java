package Interfaces.Challenge;

public class Main {
    public static void main(String[] args) {
        /**
         * Create a single interface  ( name : Saveable)
         * That interface allows an object to be saved to some sort of storage medium (use ArrayList)
         * The exact type of medium is not known to the interface (nor to the classes that implement it)
         * The interface will just specify two methods , one to return an ArrayList of values to be saved
         * and other to populate the object's fields from an ArrayList(parameter)
         *
         * Create a few sample classes that implement  your Saveable interface (we've used the idea of the game
         * with Players and Monsters but you write any type of classes that you want) .
         *
         * Override the toString() method for each for each of your classes so that they can be easily printed to enable the
         * program to be tested easily.
         *
         * In the main method write a method that takes object that implements the interface as a parameter and saves the
         * values eg calls the method defined in the interface .
         *
         * We haven't covered the I/O yet , so your method should just print the values to the screen
         * Also in the Main class , write a method that restores the values to a Saveable object
         * eg Calls the method from the interface for populating fields (see above ).
         *
         * Again, we are not going to use Java file I/O : instead use the readValues() method below to simulate getting values
         * from the file - this allows you to type as many values as your class requires , and returns an ArrayList .
         * There is a whole Java section to be learnt where we will be using files, etc...
         */
    }
}
