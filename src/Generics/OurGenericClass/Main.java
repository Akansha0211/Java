package Generics.OurGenericClass;

public class Main {
    public static void main(String[] args) {
        FootballPlayer ayush = new FootballPlayer("ayush");
        BaseballPlayer panshul = new BaseballPlayer("panshul");
        SoccerPlayer mukund = new SoccerPlayer("mukund");

//        Team footballTeam = new Team("FootballTeam");
//        footballTeam.addPlayer(ayush);
//        footballTeam.addPlayer(panshul);
//        footballTeam.addPlayer(mukund);
//        System.out.println(footballTeam.numOfPlayers());

//        //Above we see that ayush , panshul , mukund all of them are not football players only ayush is a football player
//
//        // so we need to make Team class Generics as well.


        Team<FootballPlayer> footballTeam = new Team("FootballTeam");
        footballTeam.addPlayer(ayush);

        Team<BaseballPlayer> baseballTeam = new Team<>("BaseBallTeam");
//        baseballTeam.addPlayer(mukund); // now this will give us an error as Now Type Of Team is BaseballPlayer.Earlier it was not the case..
        baseballTeam.addPlayer(panshul);







    }

}
