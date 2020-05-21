package Generics;

import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//        ArrayList numbers = new ArrayList(); // we have not told what type Objects we wil be storing in the ArrayList(Generics was introduced in Java 1.5)
//
//        //With Generics type safety becomes easy (no exception related to type occurs at runtime)
//        //We wil provide a type parameter to generic type i.e Parametrized type )use angular brackets...
//
//
//        numbers.add(1);  //Autoboxing --> primitive to Integer
//        numbers.add(2);
//        //numbers.add("Akansha"); // will give error at runtime
//
//        //(View --> Tools---> Messages)
//
//        printArrayList(numbers);
//    }
//    public static void printArrayList(ArrayList n){
//        for (Object i : n){
//            System.out.println((Integer)i*2);
//        }
//    }

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(); // type of ArrayList is Integer

        items.add(1);  //Autoboxing --> primitive to Integer
        items.add(2);
        //items.add("Akansha"); // will give error here itself
        printArrayList(items);

    }
    public static void printArrayList(ArrayList<Integer> n){
        for (int i : n){ // Unboxing Integer -->int primitive type
            System.out.println((Integer)i*2);
        }
    }



    }
