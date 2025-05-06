package CardGame;

import java.util.ArrayList;

public class Player {
    private String name;
    protected int gameMoney;
    private ArrayList <String> hands = new ArrayList <> ();

    public Player(String name) {
        this.name = name;
        this.gameMoney = 10000;
        this.hands = new ArrayList <> ();
    }

    public void addCard(String card) {
        hands.add(card);
    }


    public String getName() {
        return name;
    }


}
