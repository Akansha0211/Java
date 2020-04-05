package array.minEleChallenge;

import java.util.Scanner;

/**
 * Write a method called readIntegers() with parameter called count that represents how may Integers the user needs to enter .
 * The method needs to read from console until all the numbers are entered , and the return an array containing the numbers entered.
 * Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
 * In the main() method read the count from the console and call the method readIntegers() with the count parameter.
 * Then call he findMin() method passing the array returned from the call to the readIntegers method.
 * Finally ,print the minimum element in the array.
 *
 * Tips:
 * Assume the user only enters numbers never letters.
 *For simplicity,create a Scanner as a static field to help with data input.
 * Create a new console project with the name 'MinElementChallenge'.
 */

public class MinElementChallenge {
    private static Scanner scan= new Scanner(System.in);

    /**
     * This method will return the array elements entered through the console
     * @param numbers the number of elements which needed to be added in the array
     * @return array which is entered through the console...
     */
    public static int[] readIntegers(int numbers){
        System.out.println("Enter "+ numbers + " elements");
        int [] array = new int[numbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

}
