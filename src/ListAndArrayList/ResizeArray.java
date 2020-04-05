package ListAndArrayList;

import java.util.Scanner;

public class ResizeArray {
    private static Scanner scan = new Scanner(System.in);
    private static int [] array = new int[10];

    public static void main(String[] args) {

    }

    /**
     * This method will give elements to the array from the console...
     */
    public static void getInput(){
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    /**
     * This method will print the array...
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }

    /**
     * Ths method will resize the array
     */
    public static void resizeArray(){
        int[] original = array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = original[i];
        }
    }

}
