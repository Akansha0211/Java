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

    }
    public static void printList(List<Theatre.Seat>list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNum());
        }
    }
}
