package ArrayList.groceryList;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryLst = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        //int choice = 0 ;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryLst.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
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
    public static  void addItem(){
        System.out.println("Please enter the grocery item");
        groceryLst.addGroceryItem(scanner.nextLine());
    }

//    /**
//     *  This method wil modify the element in List at a particular index
//     *  will call for modifyGroceryList() method .
//     */
//    public static void modifyItem(){
//        System.out.println("Enter the item number");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter replacement item");
//        String newItem = scanner.nextLine();
//        groceryLst.modifyGroceryList(itemNo -1,newItem);
//
//    }


    public static void modifyItem(){
        System.out.println("Enter current item name");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new item");
        String newItem = scanner.nextLine();
       groceryLst.modifyGroceryList(currentItem,newItem);

    }


//    /**
//     * This method will remove an item from the grocery List.
//     * will call removeGroceryItem() method in it from the GroceryList class..
//     */
//    public static void removeItem(){
//        System.out.println("Enter the item number");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        groceryLst.removeGroceryItem(itemNo -1);
//    }
//

    public static void removeItem(){
        System.out.println("Enter the item to be removed");
        String item = scanner.nextLine();
        groceryLst.removeGroceryItem(item);
    }

//    public static void searchItem(){
//        System.out.println("Item to search for");
//        String searchItem = scanner.nextLine();
//        if (groceryLst.findItem(searchItem)!= null){
//            System.out.println("Found "+ searchItem+ "in the grocery list");
//        }
//        else{
//            System.out.println(searchItem+" is not found in the shopping list");
//        }
//
//    }

    /**
     * This method will search an item in te list .
     */
    public static void searchItem(){
        System.out.println("Item to search for");
        String searchItem = scanner.nextLine();
        if (groceryLst.onFile(searchItem)){
            System.out.println("Found "+searchItem);

        }
        else{
            System.out.println(searchItem+" not found in list");
        }

    }

    /**
     * This method will process list ....
     * Put contents of one list into another using addAll and getGroceryList methods
     * copy the contents of List into an Array --> by giving array the size of list and then using getter and toArray methods together...
     */
    public static void processArrayList(){
        ArrayList<String> newList = new ArrayList<>();

        // this method will copy all the items of Grocery List into another List i.e newList...
        newList.addAll(groceryLst.getGroceryList());

        // does the same as the above method ....
        ArrayList<String> list = new ArrayList<>(groceryLst.getGroceryList());


        //storing all the elements of list into an array
        String[] myArray = new String[groceryLst.getGroceryList().size()]; // size of Array is equal to the sie of list.
        myArray = groceryLst.getGroceryList().toArray(myArray); // copy elements of list into an array
    }


}