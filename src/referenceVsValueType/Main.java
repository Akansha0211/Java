package referenceVsValueType;

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
    }
}
