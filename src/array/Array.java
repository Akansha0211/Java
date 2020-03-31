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
//        for (int i = 0; i < anotherArray.length; i++) { // easy to maintain code use anotherArray.length
//            System.out.println(anotherArray[i]);
//            System.out.println(anotherArray[20]);
//        }
        printArray(anotherArray);


    }

    /**
     * This method will print the array
     * Instead of printing an array directly just make a method out of it.
     * @param array array to be printed
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) { // easy to maintain code use anotherArray.length
            System.out.println(array[i]);
        }
    }

}
