package ArrayList;

import ArrayList.phoneDirctory.Contact;
import ArrayList.phoneDirctory.PhoneDirectory;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PhoneDirectory contactList = new PhoneDirectory();
    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while(!quit){
            System.out.println("Enter your choice");
            int choice  = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    contactList.printContact();
                    break;
                case 1:
                    //addContact();
                    break;
                case 2:
                    //updateContact();
                    break;
                case 3:
                    //removeContact();
                    break;
                case 4:
                    //queryContact();
                    break;
                case 5:
                    System.out.println("Print available choice");
                    printActions();
                    break;


            }
        }
    }

    /**
     * This method will print all the instructions....
     */
    public static void printActions(){
        System.out.println("Available actions :");
        System.out.println(" 0 -- to print contacts" +
                "1 -- to add anew contact" +
                "2 -- to update an existing contact" +
                "3 -- to remove an existing contact" +
                "4 -- query if a contact exists" +
                "5-- to print available actions");
        System.out.println("Choose you action");
    }

    /**
     * Thos method will add a contact in the Contact List
     * will call addNewContact method of PhoneDirectory....
     */
    public static void  addNewContact(){
        System.out.println("Enter a new contact name ");
        String name = scanner.nextLine();
        System.out.println("Enter  phone number");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name,number);
        if(contactList.addNewContact(newContact)){
            System.out.println("New contact added : name "+ name+ " phone number"+ number);
        }
        else {
            System.out.println("Cannot add "+ name + " already present in the list");
        }


    }
}
