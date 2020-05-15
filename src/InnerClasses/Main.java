package InnerClasses;

public class Main {
    public static void main(String[] args) {
        GearBox maruti = new GearBox(6);
//        GearBox.Gear first = maruti.new Gear(1,12.3);
//
//        //GearBox.Gear second = new GearBox.Gear(1,12.3);  // need to make Gear class static
//        //GearBox.Gear third = new maruti.Gear(1,12.3); // cannot resolve symbol Gear
//
//        System.out.println(first.driveSpeed(1000));

        //Since only GerBox class can see the functionality of the Gear class so Gear class is made private ....

        maruti.addGear(1,5.3);
        maruti.addGear(2,5.3);
        maruti.addGear(3,5.3);
        maruti.addGear(4,5.3);

        maruti.operateClutch(true);
        maruti.changeGear(1);
        maruti.operateClutch(false);
        System.out.println(maruti.Speed(1000));
        maruti.changeGear(2);
        System.out.println(maruti.Speed(2000));
        maruti.operateClutch(true);
        maruti.changeGear(3);
        maruti.operateClutch(false);
        System.out.println(maruti.Speed(3000));
    }
}
