package CardGame;

import java.util.ArrayList;

public class CardDeck {
    static String [] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    static String [] pattern = {"Spade", "Heart", "Diamond", "clover"};
    static ArrayList <String> cardList = new ArrayList <> ();

    //    static String [] [] card = new String [pattern.length] [number.length];


    public CardDeck() {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < number.length; j++) {
                cardList.add(pattern [i] + number [j]);
            }
        }

        for (int i = 0; i < cardList.size(); i++) {
            int n = (int) (Math.random() * cardList.size());

            String tmp = cardList.get(i);
            cardList.set(i, cardList.get(n));
            cardList.set(n, tmp);
        }

    }



//    public CardDeck() {
//        for (int i = 0; i < pattern.length; i++) {
//            for (int j = 0; j < number.length; j++) {
//                card [i] [j] = pattern [i] + number [j];
//            }
//        }
//
//        for (int i = 0; i < pattern.length; i++) {
//            for (int j = 0; j < number.length; j++) {
//                int n = (int) (Math.random() * pattern.length);
//                int m = (int) (Math.random() * number.length);
//
//                String tmp = card [i] [j];
//                card [i] [j] = card [n] [m];
//                card [n] [m] = tmp;
//            }
//        }
//
//    }

//    public void printCards() {
//        for (int i = 0; i < pattern.length; i++) {
//            for (int j = 0; j < number.length; j++) {
//                System.out.print(card[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public void printCards() {
//        for (int i = 0; i < pattern.length; i++) {
//            for (int j = 0; j < number.length; j++) {
//                System.out.print(cardList + " ");
//            }
//            System.out.println();
//        }
//    }

}



