package AbstractClasses;

//Now making Bird class also Abstract
public abstract class Bird extends Animal {
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

    public abstract void fly(); // creating an Abstract method that individual Bird objects could occupy
}
