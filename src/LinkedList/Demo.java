package LinkedList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//

//        placesToVisit.add(1,"Alice Springs");
//        printList(placesToVisit);

        //OUTPUT TILL NOW :
//        Now visiting Sydney
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================
//        Now visiting Sydney
//        Now visiting Alice Springs
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================

//        placesToVisit.remove(4);
//        printList(placesToVisit);

//        Now visiting Sydney
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================
//        Now visiting Sydney
//        Now visiting Alice Springs
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Perth
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================
//        Now visiting Sydney
//        Now visiting Alice Springs
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================

//        placesToVisit.remove("Alice Springs");
//        printList(placesToVisit);

//        Now visiting Sydney
//        Now visiting Melbourne
//        Now visiting Brisbane
//        Now visiting Canberra
//        Now visiting Adelaide
//        Now visiting Darwin
//        =================================


//        addInOrder(placesToVisit,"Sydney");
//        addInOrder(placesToVisit,"Melbourne");
//        addInOrder(placesToVisit,"Brisbane");
//        addInOrder(placesToVisit,"Perth");
//        addInOrder(placesToVisit,"Canberra");
//        addInOrder(placesToVisit,"Adelaide");
//        addInOrder(placesToVisit,"Darwin");
//
//        printList(placesToVisit);

//        Now visiting Adelaide
//        Now visiting Brisbane
//        Now visiting Canberra
//        Now visiting Darwin
//        Now visiting Melbourne
//        Now visiting Perth
//        Now visiting Sydney
//        =================================

//        addInOrder(placesToVisit,"Alice Spings");
//        addInOrder(placesToVisit,"Darwin");
//        printList(placesToVisit);

//        Darwinis already in the LinkedList
//        Now visiting Adelaide
//        Now visiting Alice Spings
//        Now visiting Brisbane
//        Now visiting Canberra
//        Now visiting Darwin
//        Now visiting Melbourne
//        Now visiting Perth
//        Now visiting Sydney
//        =================================





//        visit(placesToVisit);
//        printList(placesToVisit);

//        No cities in the List
//        =================================



        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        addInOrder(placesToVisit,"Alice Spings");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
        printList(placesToVisit);

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

    /**
     * This method will add the items alphabetically in the LinkedList
     * If the same city repaetes then will not add the City in the LinkedList
     * @param linkedList
     * @param newCity
     * @return
     */
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0){
                System.out.println(newCity + "is already in the LinkedList");
                return false;
            }else if (comparision>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    /**
     * This method will visit the cities as according to your need
     * if you want to go forward or backward
     * Iterator hovers between items so need to specified in which we want ot move...
     * @param citiesList
     */
    private static void visit(LinkedList citiesList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = citiesList.listIterator();
        if (citiesList.isEmpty()){
            System.out.println("No cities in the List");
            return;
        }else {
            System.out.println("Now visiting "+ listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("List over");
                    quit = false;
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+ listIterator.next());

                    }else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions\n" +
                "0 -- to quit \n" +
                "1 --- to go next city\n" +
                "2  --  to go to previous city\n" +
                "3 --- to print the menu options ");
    }

}
