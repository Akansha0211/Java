package array;

import java.util.Scanner;

public class AverageOfArrayElemens {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] anotherArray = getIntegers(5);

    }

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
