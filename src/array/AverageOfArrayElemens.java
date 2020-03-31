package array;

import java.util.Scanner;

public class AverageOfArrayElemens {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] anotherArray = getIntegers(5);

        // this will print the values of array elements returned by the getIntegers() method
        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println("Element " + i + " typed value was" + anotherArray);
        }

    }

    /**
     * This method will take input of Array elements from the user
     *
     * @param numbers the number of values an array has
     * @return an array i.e int[] values to the array in the main method i.e int[] anotherArray
     */
    public static int[] getIntegers(int numbers) {
        System.out.println("Enter the number of integer value you would like to ad to your array i.e anotherArray");
        //int [] values = scan.nextInt();  Not valid operation
        //int values = scan.nextInt();     but this is valid

        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();

        }
        return values;

    }
}
