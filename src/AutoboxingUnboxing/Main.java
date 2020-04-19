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

        Integer integer = new Integer(23);
        Double doubleValue = new Double(25.7);
        System.out.println(integer);
        System.out.println(doubleValue);

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10 ; i++) {
            myArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i+" -->"+ myArrayList.get(i).intValue());
        }


        //Autoboxing....
        Integer myIntValue = Integer.valueOf(56);
        System.out.println(myIntValue);
        Integer myIntvalu = 56;
        System.out.println(myIntvalu);

        //Unboxing....
        int myInt = myIntValue.intValue();
        System.out.println(myInt);

        ArrayList<Double> doubleValues = new ArrayList<Double>();
        for (double dbl = 0; dbl <=10 ; dbl+=0.5) {
            doubleValues.add(Double.valueOf(dbl));  // boxing
        }
        for (int i = 0; i<doubleValues.size();i++){
//            double values = doubleValues.get(i).doubleValue(); // unboxing
//            System.out.println(i+ " -->"+ values);


            System.out.println(doubleValues.get(i).doubleValue());
        }
    }
}
