package CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Casino {
    public static void main (String [] args) {

        System.out.println("게임을 시작합니다.");
        CardDeck deck = new CardDeck();
        Dealer dealer = new Dealer();

        dealer.dealer();


//        CardDeck CardDeck = new CardDeck();
//        CardDeck.printCards();

//        for (Object name : nameList) {
//            System.out.print(name + " ");
//        }

    }
}
