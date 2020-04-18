package ArrayList.groceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    /**
     * This method will add an item to the grocery list.
     * uses add() method of the ArrayList class
     * @param item is to be added to the List...
     */
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    /**
     * This method will print the Grocery list items .
     * uses (i+1) in print statement :
     * as to the user the item number in the list begins with 1 ,... not 0 so [index(=0,....)+1]
     */
    public void printGroceryList(){
        System.out.println("You have  "+ groceryList.size()+ "  items in the list ");
        for (int i = 0; i <groceryList.size() ; i++) {
            System.out.println((i+1)+"."+groceryList.get(i) );
        }
    }





}
