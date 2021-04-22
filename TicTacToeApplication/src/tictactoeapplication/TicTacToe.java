/*
 * Copyright 2021 mararosa
 */
package tictactoeapplication;

/**
 * @author mararosa
 */
public class TicTacToe {
    // Picture if Game with Index:
    // FOR STORAGE:
    // 0 | 1 | 2
    // --------------------
    // 3 | 4 | 5
    // --------------------
    // 6 | 7 | 8
    //WHAT THE USER THINKS:
    // 1 | 2 | 3
    // --------------------
    // 4 | 5 | 6
    // --------------------
    // 7 | 8 | 9
    // --------------------

    // UI Picture of Game:
    // INIT:
    // | - | - | - 
    // -------------
    // | - | - | - 
    // -------------
    // | - | - | - 
    // -------------
    // GAMEPLAY:
    // | 0 | - | 0 
    // -------------
    // | - | x | - 
    // -------------
    // | - | - | x 
    // -------------
    protected char[] board; // It is gonna be a board of characters
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }

    //static -> This is going to return a blank board and anyone can use it but it is gonna be a blank tic-tac-toe board
    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker; //the reason for - 1 is because - for example: we show to the user 1 but the index is 0
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker; //If is valid we need to play the turn - flip if it is like the users turn now then we need to flip it over to the ai turn. And if it is ai turn then we need to change it to the users turn. After they've taken their turn.
        }
        return isValid; // the reason we are returning boolean if is that, if it was valid then we played the turn otherwise we'll return false and we'll say try again and make another turn.
    }

    // Check if our spot is in range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    // Check if the spot is taken
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-'; // If the number/spot is not equal the stash character then that means it's taken
    }

    public void printBoard() {
        // Attempting to create...
        // | - | - | - 
        // -------------
        // | - | - | - 
        // -------------
        // | - | - | - 
        // -------------
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        // check if  there's a winner on the board, ex: three X's in a rows three O's in a row
        boolean diagonalsAndMiddles = (rightDiagonal() || leftDiagonal() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '0';
        // We save the winner at the correct position. Whatever the position was we saved up that charcter is the winner
        if (diagonalsAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }

    // Implement the help functions in IsThereAWinner
    public boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDiagonal() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDiagonal() {
        return board[2] == board[4] && board[4] == board[6];
    }

    // Check if the board is filled
    public boolean isTheBoardFilled() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else if (isTheBoardFilled()) {
            return "Draw: Game Over";
        } else {
            return "notOver";
        }
    }
}
