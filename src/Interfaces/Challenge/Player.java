package Interfaces.Challenge;

import java.util.ArrayList;

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
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

    }
}
