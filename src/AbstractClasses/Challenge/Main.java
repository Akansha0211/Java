package AbstractClasses.Challenge;

public class Main {
    /**
     * For this challenge,create an abstract class to define items that can be stored in a list.
     * The class should contain 2 references to items which will represent the next and previous items(in the case of linked list)
     * i.e If you call your abstract class ListItem, then it would have 2 member variables of type ListItem
     * that will hold references to the next/right and previous/left ListItems
     *
     * The abstract class will also need to hold a value - try to be as flexible as possible when defining the type of this value.
     *
     * The class will also need methods to move to its next item and back to its previous item,
     * and methods to set the next and previous items
     *
     * You should also specify a compareTo() method that takes a parameter of the same type as the class and returns 0 if the values are equal,
     * greater than zero if the values sorts greater than the parameter and less than zero if it sorts less than the parameter.
     *
     * Create a Concrete class from your abstract list item class and use this in  a linked list class to implement  a lINked List that will add items in order
     * so that they are sorted alphabetically. Duplicate values are not added
     *
     * Note that you are creating your own Linked List here , not using the built-in- Java one...
     *
     * The rules for adding an item to the LinkedList are:
     * If the head of the List is null , make head refer to the item added
     * If the item to be added is less than the current item in list ,add the item before the current item
     * i.e make previous item's "next" refer to the new item, and the new items "next" refer to the  current item.
     * If the item to be added is greater than the current item , move onto the next item and compare again (if there is no next item then that is where the new item belongs)
     *
     * Care will be needed when inserting before the first item in the Listas it will not have the previous item.
     *
     * You will need a method to remove an item from the List
     *
     * Hint: If you are creating classes with names such as List , LinkedList , node ,etc , make sure that you create your classes before referring to them.
     * If you create classes names that INtelliJ recognises as Java classes such as Linked list then it will create imports for them
     *
     * Optional : Create a class to use your concrete class to implement a Binary Search Tree:
     * When adding items to Binary Search Tree , if the item to be added is less than the current item
     * then move to the left , if it is greater than the current item move to the right...
     *
     * The new item is added when an attempt to move in the required direction would involve following a null reference
     * Once again, duplicates are not allowed.
     *
     * Hint : To avoid typing loads of "addItem" lines , split a string into an array and create your List in a Loop as in the example below
     *
     * Create a string data array to avoid typing loads of addItem instructions :
     *
     *
     */
    public static void main(String[] args) {
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra ";
        String[] data = stringData.split("");
        for(String s : data){

        }
    }
}
