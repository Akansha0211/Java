package Interfaces;

public class Main {
    public static void main(String[] args) {
        iTelephone phone ;
        phone= new DeskPhone(1234567); // create instance for DeskPhone class

        // can't instantiate Interface
       // iTelephone phone1 = new iTelephone();

       phone.powerOn();
       phone.callPhone(1234567);
       phone.answer();

       phone = new MobilePhone(243565);
       phone.powerOn();
       phone.callPhone(243565);
       phone.answer();

    }
}
