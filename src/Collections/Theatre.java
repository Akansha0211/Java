package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theatre {
    String theatreName;
    List<Seat> seats = new ArrayList<>();
    public Theatre(String theatreName, int numRows , int seatPerRow){
        this.theatreName = theatreName;
        int lastRow = 'A'+(numRows-1);
        for (char row ='A'; row<=lastRow; row++){
            for (int seatNum = 1; seatNum<= seatPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }
    public void getSeats(){
        for (Seat seat : seats){
            System.out.println(seat.getSeatNum());
        }
    }
    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if (foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat"+seatNumber);
        }
        return false;
//        for (Seat seat:seats){
//            //System.out.print(".");
//            if (seat.getSeatNum().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat==null){
//            System.out.println("There is no seat"+seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();

    }

    public  class Seat implements Comparable<Seat>{
        String seatNum;
        boolean reserved= false;

        @Override
        public int compareTo(Seat seat) {
            return this.seatNum.compareToIgnoreCase(seat.getSeatNum());
        }

        public Seat(String seatNum){
            this.seatNum = seatNum;
        }
        public String getSeatNum(){
            return seatNum;
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+seatNum+" reserved");
                return true;
            }else {
                return false;
            }
        }
        public boolean cancel(){
            if (this.reserved){
                this.reserved =  false;
                System.out.println("Resrvation of seats"+seatNum+ "cancelled");
                return true;
            }
            else {
                return false;
            }
        }
    }

}
