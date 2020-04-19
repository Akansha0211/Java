package AutoboxingUnboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;
    public  IntClass(int myValue){
        this.myValue = myValue;
    }
   public int getMyValue(){
        return myValue;
   }
   public void setMyValue(int myValue){
        this.myValue = myValue;
   }
}
public class Main {
    public static void main(String[] args) {
//        String [] strArray = new String[10]; // Array to store String elements

//        int[] intArray = new int[10]; // array to store integer elements


//        ArrayList<String> strArrayList = new ArrayList<String>(); // Only class can be passed as type of ArrayList
//        strArrayList.add("Akansha");

//        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
    }
}
