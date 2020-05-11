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


    @Override
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

    }
}
