package array;

import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using  arrays that sort a list of integers using descending order
        // Descending order is highest value to lowest
        // IN other word if the array had the values i it 106, 26,81,5,15 your program should
        // ultimately have an array with 106,81,26,15,5 int it
        // set up the program so that the numbers to sort or read in from the keyboard
        // implement the following methods - getIntegers , printArray , sortIntegers
        // getIntegers returns an array of entered integers from the keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array
        int[] array = getIntegers(5);
        printArray(array);

    }

    public static int[] getIntegers(int numbers) {
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
