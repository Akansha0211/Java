package Interfaces;

/**
 * Creating an interface
 * Interface is like a contract that the method signatures defined in the interface will not change.
 * A class that implements the interface implements  all the methods of the interface
 * with exact signature as that present in the interface
 * Interface is Abstract Data Type i.e it consists of no code
 * Use : Provide a common behaviour to  several classes implementing it
 * Access modifiers can be omitted as it will be included in the actual class...
 */
public interface iTelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
