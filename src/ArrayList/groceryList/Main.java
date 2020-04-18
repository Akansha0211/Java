package ArrayList.groceryList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryLst = new GroceryList();

        boolean quit = false;
        int choice = 0;
        //printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    //printInstructions();
                    break;
                case 1:
                    groceryLst.printGroceryList();
                    break;
                case 2:
                    //addItem();
                    break;
                case 3:
                    //modifyItem();
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

}