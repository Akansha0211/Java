package array;

public class Array {
    public static void main(String[] args) {
        // define an integer array
        int[] intArray = new int[10];

        //defining a double type Array
        //double[] doubleArray = new double[10];

        //Adding element to an array
        intArray[0] = 20;

        // defining and initializing an Array
        int[] myIntArray = {1, 2, 3, 4, 5, 6};
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);


        // defining an Integer Array in a different way and  then printing it using for loop...
        int[] anotherArray = new int[10];

        //assigning elements to an Array
        for (int i = 0; i < 10; i++) {
            anotherArray[i] = i + 10;
        }

        // printing the array
        for (int i = 0; i < 10; i++) {
            System.out.println(anotherArray[i]);
        }


    }
}
