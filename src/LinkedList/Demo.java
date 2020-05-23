package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        //OUTPUT TILL NOW :
//        Now visiting Sydney
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//                =================================
//        Now visiting Sydney
//        Now visiting Alice Springs
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//                =================================

    }

    /**
     * This method will print all the items in a LinkedList using Iterator using hasNext() and next() method
     * @param linkedList
     */
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next()); //next() method will return current tem and will start pointing to next item
        }
        System.out.println("=================================");
    }

}
