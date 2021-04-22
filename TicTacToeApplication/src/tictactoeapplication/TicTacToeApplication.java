/*
 * Copyright 2021 mararosa
 */
package tictactoeapplication;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author mararosa
 */
public class TicTacToeApplication {

    public static void main(String[] args) throws InterruptedException {

        // Getting input
        Scanner scan = new Scanner(System.in); // System.in take the stuff we put in your scanner
        // Allows for continous games
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            // Setting up our tokens and AI
            System.out.println("Welcome to Tic Tac Toe! You are about to go "
                    + "against the master of Tic Tac Toe. Are you ready? "
                    + "I hope so!\n BUT FIRST, you must pick what character you "
                    + "want to be and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will representer you on the board");
            char playerToken = scan.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = scan.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // Set up the game
            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number "
                    + "and your token shall be put in its place.\nThe numbers go"
                    + " from 1-9, left to right. We shall see who will win.");
            TicTacToe.printIndexBoard();
            System.out.println();

            // Let's play!
            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {
                    // USER TURN
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scan.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again. " + spot + " is ivalid. "
                                + "This spot is already taken or it is out of range");
                        spot = scan.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    // AI turn
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("it's my turn!");
                    // Pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + " !");
                }
                // Print out new board
                TimeUnit.SECONDS.sleep(2);
                System.out.println();
                game.printBoard();
                System.out.println();
            }
            System.out.println(game.gameOver());
            System.out.println();
            // Set up a new game... or not depending on the response
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Do you want to play again? Enter Y if you do. "
                    + "Enter anything else if you are tired of me.");
            char response = scan.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }
}
