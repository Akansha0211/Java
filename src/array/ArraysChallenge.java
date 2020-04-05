package array;

import java.util.Arrays;
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
        //printArray(array);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray); // will print sorted array

    }

    /**
     * This method will accept the value of integer array as parameter
     *
     * @param capacity is the size of the array
     * @return the array after user input
     */
    public static int[] getIntegers(int capacity) {
        System.out.println("Enter 5 elements");
        int[] values = new int[capacity];
        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    /**
     * This method will print the array passed to it as a parameter
     * @param array array to be printed
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * This method will sort the integer array
     * @param array array to be sorted
     * @return the sorted array
     */
    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        // alternative way to perform above statements of copying one array into another blank array and can give desirable size to it...
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
