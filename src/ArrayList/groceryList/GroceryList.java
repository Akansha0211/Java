package ArrayList.groceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

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
     * This method will an item in the list
     * For example :
     * You have a prepared a grocery list :
     * milk
     * butter
     * cheese
     * mayonnaise
     * bread
     * Now  you want to modify cheese to cream cheese .
     * For that from naive user's perspective he need to  modify by name of item not considering the item number and inner details.
     * @param currentItem which is to be modified
     * @param newItem new tem to be placed in place of modified item (i.e current item)...
     **/
    public  void modifyGroceryList(String currentItem,String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryList(position,newItem);
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
     * This method will  also remove an item from the list
     * The only difference between the two methods is that we will remove an item by giving only String in parameter.
     * For example you have a shopping list app in your phone and you have purchased an item and wnt to remove it
     * So you will try to remove its name from the list
     * Being a naive user you might not be knowing the functionality of all the methods in it
     * So fo the user removing an item from the list does its  task ..
     *
     * In this method you will call above remove method
     * And since you are calling above remove method in this class itself you can make the above method  private
     * To hide its functionality from other classes...
     * @param item
     */
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(position);
        }
    }


//    /**
//     * This method will find an item in the list
//     * @param searchItem item to searched for in the List
//     * @return searched item in the list....
//     */


//    public String findItem(String searchItem){
//      // boolean exists = groceryList.contains(searchItem);
//
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
//
//    }


    /**
     * This method will return the index number of the search item.
     * @param searchItem item whose index is to be found
     * @returnn  index of searchItem..if it returns 0 or any index greater than zero that means item is present in the list and -1 if item not present....
     */
    public int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }


    /**
     * This method will find whether a given item is present in the list or not
     * It will call findItem method .
     * @param searchItem which is to be searched.
     * @return boolean value  true if item is found in the list otherwise false...
     */
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return  true;
        }
       else return false;
    }

}
