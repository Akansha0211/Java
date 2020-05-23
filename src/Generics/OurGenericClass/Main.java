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

//        Team<String> brokenTeam = new Team<>("This should not have woorked"); // this should give error but not giving right now
//        //This means you can add any type to Team..
//        brokenTeam.addPlayer("no one");
//        // To sort the above problem type parameter of Team will extend  Player class so that subtype of Player i.e FootballPlayer,BaseballPlayer,SoccerPlayer
//        //Not any String...

        //After T extends Player the above portion of code is  giving  error

        Team<FootballPlayer> footballTeam2 = new Team<>("FotballTeam2");
        FootballPlayer vivek = new FootballPlayer("Vivek Sharma");
        footballTeam.addPlayer(vivek);

        Team<FootballPlayer> footballTeam3  = new Team<>("FootballTeam3");
        Team<FootballPlayer> footballTeam4 = new Team<>("FootballTeam4");

        footballTeam3.matchResults(footballTeam4,1,0);
        footballTeam4.matchResults(footballTeam,2,1);

//        footballTeam.matchResults(baseballTeam,1,1);

        //OUTPUT :
//        ayush picked for the team FootballTeam
//        panshul picked for the team BaseBallTeam
//        Vivek Sharma picked for the team FootballTeam
//        FootballTeam3 best FootballTeam4
//        FootballTeam4 best FootballTeam
//        FootballTeam drew with BaseBallTeam  <---- HERE WE CAN SEE THAT FOOTBALL TEAM PLAYS WITH BASKETBALL TEAM

        // SO TO CORRECT ABOVE PROBLEM
        // Now add type parameter in matchResults method to Team opponent parameter

        // now we will get error in line no 45 i.e footballTeam.matchResults(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(footballTeam.getName()+" : "+ footballTeam.ranking());
        System.out.println(footballTeam2.getName()+": "+ footballTeam2.ranking());










    }

}
