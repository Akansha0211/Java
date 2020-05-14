package InnerClasses;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;  // to avoid shadow declaration in inner class variables
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        // TO initialise ArrayList gear

        Gear neutral =  new Gear(0,0.0);
        this.gears.add(neutral);

    }

    /**
     * This method is operate clutch
     * @param in true if clutch is set otherwise false
     */
    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    /**
     * This method will add gear to the ArrayList of gears
     * @param number which is to be added to the ArrayList of gears (eg 5th Gear or so..)
     * @param ratio It is basically the torque applied on the Gear
     */
    public void addGear(int number , double ratio){
        if((number>0)&& (number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    /**
     * This method will change the current gear which we are in
     * @param newGear  the gear in which we want to go....
     */
    public void changeGear(int newGear){
        if((newGear>=0)&&(newGear<this.gears.size())&& this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear" + newGear + "selected");
        }else {
            System.out.println("No Gear selected.There might be some problem!!");
            this.currentGear = 0;
        }
    }

//    public double Speed(int revs){
//        if (clutchIsIn){
//            System.out.println("Scream");
//            return 0.0;
//        }
//        return revs * gears.get(currentGear).getRatio();
//    }

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

        public double getRatio() {
            return ratio;
        }
    }
}
