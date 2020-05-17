package AbstractClasses;

public class Main {

    //Abstraction is when you define the functionality without implementing
    //Focused on what needs to be done rather than how it is to be done
    //Interfaces are abstract and actual implementation are left to teh classes that implement the interfaces
    //Interfaces can't be instantiated . Classes that implements the interfaces can be instantiated...


    //Java also provide abstract classes and these are the methods that provide definition but no implementation  to those methods
    //Implementation is left to the class that inherits an abstract class.

    public static void main(String[] args) {
        //Instantiate Dog class...
        Dog dog = new Dog("Husky");
        dog.breath();
        dog.eat();

//        Bird bird = new Bird("parrot");
//        bird.breath();
//        bird.eat();

        //Since not all birds can fly well so implementing fly() method in Bird class will not be a good idea
        //So we will create an Abstract Bird class that extends Animal and also has an abstract fly() method that individual Bird objects can implement

        //Now Bird is Abstract and cannot be instantiated...
        //so create a Parrot class

        Parrot parrot = new Parrot("parrot");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
