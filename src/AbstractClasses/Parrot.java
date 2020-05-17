package AbstractClasses;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

//    @Override
//    public void fly() {
//        System.out.println("Flitting from branch to branch");
//    }

    //Parrot class is automatically implementing eat() and breath() method so no need to re-implement those methods again..
    //Only to make this class valid we need to implement fly() method
}
