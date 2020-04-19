package ArrayList.phoneDirctory;

import java.util.ArrayList;

public class PhoneDirectory {
   // private String myNumber;
    private ArrayList<Contact> myContacts;

    public PhoneDirectory(){
        //this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    /**
     * This method will add an item to the Phone Directory
     * @param contact  which is to be added.
     * @return whther a contact can be added or not...
     */
    public boolean addNewContact(Contact contact){
        if (findContact(contact)>= 0) {
            System.out.println("Contact is already on the file ");
            return false;
        }

        myContacts.add(contact);
        return true;
    }


    /**
     * Tgis method will find that a particular contact is n the the  PhoneDirectory
     * IF present than return index greater than or equal to zero otherwise return -1
     * @param contact which is to be searched
     * @return the index...
     */
    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

}
