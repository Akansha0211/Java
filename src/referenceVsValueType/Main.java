package referenceVsValueType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //primitive tye i.valueTypes storing values not references i.e objects (created by using new keyword)
        int var1 = 10;
        int var2 = var1; // var2 is a variable in which var1 is copied . var1 and var2 are two different variables stored at two different locations in the memory
        System.out.println(" value of var1 = "+var1);
        System.out.println("value of var2 = "+var2);
        System.out.println("Value after change");
        var2++; // on changing var2 which is totally independent of var1 it would be wrong to assume any change in var1 as well
        System.out.println("value of var1 = "+var1);
        System.out.println("value of var2 "+var2);

        // declaring reference type...
        int[] arr1 = new int[5];   // arr1---> |__|__|__|__|__|

        int arr2[] = arr1;     // arr1---> |__|__|__|__|__|  <----- arr2
                                // same array object is referenced to by two different objects...
        System.out.println("arr1"+ Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
        arr2[0] = 1;
        System.out.println("After change in reference variable");
        System.out.println("arr1 = "+ Arrays.toString(arr1));
        System.out.println("arr2 = "+Arrays.toString(arr2));
        modify(arr1);
        System.out.println("After modify method");
        System.out.println("arr1 = "+ Arrays.toString(arr1));
        System.out.println("arr2 = "+Arrays.toString(arr2));
    }

    /**
     * This method wil modify index in the array which is specified as parameter
     * It is 3rd reference to the array ...
     * @param array change in it is passed to all the reference variables pointing the same array object...
     */
    private static void modify(int[]array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5}; // de-referencing the array
        array[1] = 3; // any further changes will not be reflected in any other arary
    }

}
