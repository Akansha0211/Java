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
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }
    public List<Seat> getSeat(){
        return seats;
    }

//    public boolean reserveSeat(String seatNumber){
//        Seat requestedSeat
//    }

    private class Seat{
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }
    }

}
