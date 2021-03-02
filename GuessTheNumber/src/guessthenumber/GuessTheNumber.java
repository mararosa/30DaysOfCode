package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int maxValue;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        maxValue = 100;
        theNumber = Math.abs(rand.nextInt()) % (maxValue + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT BRO");
                break;
            }
        }
    }
    
    

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. try and guess my impossible number. It's between 0 and " + guessGame.maxValue + " inclusive. Just type  number to get started.");
        guessGame.play();

//        howBigIsMyNumber(0);
//        howBigIsMyNumber(10);
//        howBigIsMyNumber(100);
//        howBigIsMyNumber(8);
//        howBigIsMyNumber(78);
//        howBigIsMyNumber(-5);
//        howBigIsMyNumber(113);
    }

}
