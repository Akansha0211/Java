package AbstractClasses;

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
