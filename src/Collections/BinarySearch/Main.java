package Collections.BinarySearch;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8,12);
//        System.out.println( theatre.getSeat());
        theatre.getSeat();
        theatre.reserveSeat("A10");

        if (theatre.reserveSeat("A08")){
            System.out.println("Please pay");
        }
        else {
            System.out.println("Sorry seat is taken");
        }
    }
}
