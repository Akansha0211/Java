package ArrayList.groceryList;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryLst = new GroceryList();
    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryLst.printGroceryList();
                    break;
                case 2:
                    //addItem();
                    break;
                case 3:
                   // modifyItem();
                    break;
                case 4:
                    //removeItem();
                    break;
                case 5:
                    //searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println(" 0 -- To print choice options ");
        System.out.println(" 1 -- To print the list of grocery items");
        System.out.println(" 2 -- To add an item in the list.");
        System.out.println(" 3 -- To modify an item in the list.");
        System.out.println(" 4 -- To remove an item from the list");
        System.out.println(" 5 -- To search an item in the list");
        System.out.println(" 6 -- To quit the application");
    }

    /**
     * This method will add an item to the ArrayList
     * It will call the method addGroceryItem in the this method and will give the Item to be added through the console...
     */
    public static  void addIem(){
        System.out.println("Please enter the grocery item");
        groceryLst.addGroceryItem(scanner.nextLine());
    }

}