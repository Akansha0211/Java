package InnerClasses;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        // TO initialise ArrayList gear

        Gear neutral =  new Gear(0,0.0);
        this.gears.add(neutral);

    }

    /**
     * Nested classes are used when inner classes makes sense with outer classes here Gear makes sense only in GearBox
     * Inner classes have access to all the methods and fields of outer classes .
     * If we use same name of variable as that in the outer classes :
     * Like here gearNumber if we use this.gearNumber then we refer to the variable inside the inner class.
     * If we have to refer the variable in the outer class we need to use GearBox.this.gearNumber to refer to the outer class variables...
     *
     * There is a concept shadow the declaration of outer class ---> use same name of variable in  innerClass as that in the  outerClass....
     */
    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }
}
