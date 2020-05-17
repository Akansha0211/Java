package AbstractClasses;

public  class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating");  // we created getName() method in the base class so it is available in this class as well...
    }

    @Override
    public void breath() {
        System.out.println("Breath in and Breath out , repeat");
    }
}
