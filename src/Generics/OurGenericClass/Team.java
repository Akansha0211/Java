package Generics.OurGenericClass;

import java.util.ArrayList;

public class Team {
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * This method will return wherther a player acn be added ito the ArrayList  or not
     * @param player
     * @return true if a palyer acan be added or otherwise false
     */
    public boolean addPlayer(Player player){
        if (members.contains(player)){
            System.out.println(player.getName()+" is already in the team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName()+" picked for the team "+this.name);  //this.name is the actual team name
            return true;
        }
    }

    /**
     * This method will give return number of members in  a team
     * @return
     */
    public int numOfPlayers(){
        return this.members.size();
    }
}
