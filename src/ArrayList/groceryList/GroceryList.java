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


    /**
     * This method will modify an element at any particular index in the List
     * @param position at which a new replacement item is to be added
     * @param newItem replacement item ....
     */
    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+ (position+1)+" is modified");
    }


    /**
     * This method will remove an item from the ArrayList from any given index.
     * @param position from which element is to be removed...
     */
    public void removeGroceryItem(int position){
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }


    /**
     * This method will find an item in the list
     * @param searchItem item to searched for in the List
     * @return searched item in the list....
     */
    public String findItem(String searchItem){
      // boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;

    }





}
