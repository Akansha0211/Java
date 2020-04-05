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

}
