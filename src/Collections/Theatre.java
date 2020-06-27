package Collections;

import java.util.ArrayList;
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
            System.out.println(seat);
        }
    }

    public  class Seat{
        String seatNum;
        boolean reserved= false;
        public Seat(String seatNum){
            this.seatNum = seatNum;
        }
    }
}
