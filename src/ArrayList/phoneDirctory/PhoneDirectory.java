package ArrayList.phoneDirctory;

import java.util.ArrayList;

public class PhoneDirectory {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public PhoneDirectory( String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


}
