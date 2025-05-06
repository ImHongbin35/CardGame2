package CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealer extends CardDeck {

    ArrayList <Player> players = new ArrayList <> ();

    public void dealer() {
        Scanner sc = new Scanner(System.in);
//        String [] hands = new String [2];

        int playerNumber = players.size();

        System.out.println("참가자 이름을 입력하세요");
        System.out.println("(최대 20글자, 최대 4명까지 가능합니다. 공백으로 구분합니다.)");

        String line = sc.nextLine();
        String[] names = line.trim().split("\\s+");

        for (int i = 0; i < Math.min(names.length, 4); i++) {
            players.add(new Player(names[i]));  // Player 객체 생성 후 추가
        }
    }

//        int i;
//        for (i = 0; i < 4; i++) {
//            System.out.println((i + 1) + "번째 이름을 입력하세요. (시작은 그냥 엔터)");
//            String name = sc.nextLine();
//
//            if (name.trim().isEmpty()) {
//                break;
//            }
//            players.add(name);
//        }

//        for (i = 0; i < 4; i++) {
//            Player player = (Player) players.get(i);
//        }

//        for (i = 0; i < 2; i++) {
//            String [] hands = card [i] [playerNumber];
//        }

    public void dealCards() {
        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);
            for (int j = 0; j < 2; j++) {
                p.addCard(CardDeck.cardList.remove(0));
            }
        }
    }


}
