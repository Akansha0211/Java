package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a single interface  ( name : Saveable)
 *  That interface allows an object to be saved to some sort of storage medium (use ArrayList)
 *  The exact type of medium is not known to the interface (nor to the classes that implement it)
 *
 *  The interface will just specify two methods , one to return an ArrayList of values to be saved
 *   and other to populate the object's fields from an ArrayList(parameter)...
 */
public interface iSaveable {
    List<String> write();  // populate ArrayList
    void read(List<String> savedValues);
}
