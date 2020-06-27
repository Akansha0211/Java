package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8,12);
        //theatre.getSeats();
//        if(theatre.reserveSeat("H11")){
//            System.out.println("PLease pay");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
        /**
         * Creating shallow copy of theatre.seats
         * Only reference differs but both reference to the same objects
         */
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);  // shallow copy of t
        printList(seatCopy);
        seatCopy.get(1).reserve(); // this will affect seatCopy and theater.seats both as same elements with different reference variable
        if (theatre.reserveSeat("A02")){
            System.out.println("PLease pay for A02");
        }else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy); // this will not affect theatre.seats ( shuffle and reverse both)
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing Theatre.Seat");
        //System.out.println(theatre.seats);
        printList(theatre.seats);

//        List<Theatre.Seat>newList= new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList,theatre.seats);
//        System.out.println("Printing newList");
//        printList(newList);

        System.out.println("\n");
        System.out.println("**********************");
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is "+minSeat.getSeatNum());
        System.out.println("Max seat number is"+maxSeat.getSeatNum());

    }
    public static void printList(List<Theatre.Seat>list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNum());
        }
    }
    public static void sortList(List<? extends Theatre.Seat>list){
        for (int i = 0;i<list.size()-1;i++){
            for (int j = 0; j<list.size()-1;j++){
                if (list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
