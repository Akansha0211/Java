package InnerClasses;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);

        //Since only GerBox class can see the functionality of the Gear class so Gear class is made private ....

//        GearBox.Gear first = mcLaren.new Gear(1,12.3);
//
//        //GearBox.Gear second = new GearBox.Gear(1,12.3);  // need to make Gear class static
//        //GearBox.Gear third = new mcLaren.Gear(1,12.3); // cannot resolve symbol Gear
//
//        System.out.println(first.driveSpeed(1000));
    }
}
