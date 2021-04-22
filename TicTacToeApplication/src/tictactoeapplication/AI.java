/*
 * Copyright 2021 mararosa
 */

package tictactoeapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author mararosa
 */

class AI {
    
    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList();
        for (int i = 0; i < 9; i++) {
            // If the slot is not taken, add it as a choice
            if (game.board[i] == '-') {
                choices.add(i + 1);
            }
        }
        Random random = new Random();
        int choice = choices.get(Math.abs(random.nextInt() % choices.size()));
        return choice;
    }
}
