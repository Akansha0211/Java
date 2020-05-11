package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements iSaveable {
    String playerName;
    int score;
    int strength;
    String weapon;

    public Player(String playerName, int score, int strength) {
        this.playerName = playerName;
        this.score = score;
        this.strength = strength;
        this.weapon = "AK47";
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", score=" + score +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }


    /**
     * This method will add object parameters to the List
     * @return the List....
     */
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.playerName);
        values.add(1,"" + this.score);
        values.add(2,"" + this.strength);
        values.add(3,this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

    }
}
