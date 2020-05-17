package AbstractClasses;

//Now making Bird class also Abstract
// abstract class itself that inherits from another abstract class
public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in breath out , repeat");
    }

//    public abstract void fly(); // creating an Abstract method that individual Bird objects could occupy


    @Override
    public void fly() {
        System.out.println(getName()+" if Flapping its wheel");
    }
}
