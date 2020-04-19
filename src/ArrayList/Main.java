package ArrayList;

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
}
