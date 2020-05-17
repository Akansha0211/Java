package AbstractClasses;

/**
 * It is an abstract class .
 * One of the difference between interface and abstract class is that Abstract class also has data-fields and consructor in it
 * Whereas interface only has methods to be implemented i.e method definition...
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //By creating abstract methods we are forcing the class which is inheriting the Abstract class to implement all of its methods
    //Where as while normally a class we don't need to implement all of its methods...
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
