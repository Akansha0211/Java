package ArrayList.phoneDirctory;

import java.util.ArrayList;

public class PhoneDirectory {
    private ArrayList<Contact> myContacts;

    public PhoneDirectory(){

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
     * This method will update an oldContact with a newContact if oldContact is found
     * @param oldContact which is to be replaced.
     * @param newContact replacement contact
     * @return  false if that item which you want to replace i not found in the ContactList otherwise true (and update it)...
     */
    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact)< 0){
            System.out.println(oldContact.getName()+ " was not found");
            return false;
        }
        int position = findContact(oldContact);
        this.myContacts.set(position,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+ newContact.getName());
        return  true;
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

    /**
     * This method will return the contact name if found in the PhoneDirectory object
     * @param contact
     * @return name of the contact...
     */
    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

//    public Contact queryContact(String name){
//        if (findContact(name) >= 0){
//
//        }
//    }

    /**
     * This  method will find the contact using contact name
     * @param contactName
     * @return index of the Contact
     */
    public int findContact(String contactName){
        for (int i = 0; i <this.myContacts.size() ; i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName()==contactName){
                return 1;
            }

        }
        return -1;
    }

    /**
     * This method will print the contact ...
     */
    public void printContact(){
        System.out.println("Contact List");
        for (int i = 0; i <this.myContacts.size() ; i++) {
            System.out.println((i+1)+" "+ this.myContacts.get(i).getName() + " "+ myContacts.get(i).getMobileNumber());
        }
    }




}
