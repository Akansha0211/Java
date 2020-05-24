package Collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatPerRows){
        this.theatreName = theatreName;
        int lastRow = 'A'+(numRows-1);
        for (char row ='A'; row<= lastRow;row++){
            for (int seatNum =1 ; seatNum<=seatPerRows;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }
//    public List<Seat> getSeat(){
//        return seats;
//    }

    public void getSeat(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for (Seat seat : seats){
            if (seat.getSeatNumber().equals(seatNumber) ){
                requestedSeat = seat;
            }
        }
        if (requestedSeat== null){
            System.out.println("There is no seat with seat number"+ seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    private class Seat{
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }
        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat"+ seatNumber+ "reserved");
                return true;
            }
            else {
                return false;
            }
        }
        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Resrvaton cancelled for seat number : "+seatNumber);
                return false;
            }
            else {
                return false;
            }
        }
        public String getSeatNumber(){
            return seatNumber;
        }

    }


}
