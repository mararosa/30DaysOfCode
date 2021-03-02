package cointoss;

import java.util.Random;

/**
 *
 * @author mararosa
 */
public class CoinToss {

    public String tossACoin() {
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()) % 2;
        String toss = number == 0 ? "HEADS" : "TAILS";
        return toss;

        //Same that:
//        if (number == 0) {
//            return "HEADS";
//        } else {
//            return "TAILS";
//        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }

}
