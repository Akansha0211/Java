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



}
