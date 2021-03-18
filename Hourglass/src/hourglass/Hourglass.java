/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hourglass;

/**
 *
 * @author mararosa
 */
public class Hourglass {

    // Java program to find maximum 
// sum of hour glass in matrix 
    static int ROW = 5;
    static int COLUMN = 5;

// Returns maximum sum of 
// hour glass in ar[][]
    static int findMaxSum(int[][] arrayTwoDimensional) {
        if (ROW < 3 || COLUMN < 3) {
            return -1;
        }

        // Here loop runs (R-2)*(C-2) 
        // times considering different
        // top left cells of hour glasses.
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < ROW - 2; i++) {
            for (int j = 0; j < COLUMN - 2; j++) {
                // Considering mat[i][j] as top 
                // left cell of hour glass.
                int sum = (arrayTwoDimensional[i][j] + arrayTwoDimensional[i][j + 1]
                        + arrayTwoDimensional[i][j + 2]) + (arrayTwoDimensional[i + 1][j + 1])
                        + (arrayTwoDimensional[i + 2][j] + arrayTwoDimensional[i + 2][j + 1]
                        + arrayTwoDimensional[i + 2][j + 2]);

                // If previous sum is less then 
                // current sum then update
                // new sum in max_sum
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat = 
        {{1, 2, 3, 0, 0},
        {0, 0, 0, 0, 0},
        {2, 1, 4, 0, 0},
        {0, 0, 0, 0, 0},
        {1, 1, 0, 1, 0}};
        
        int res = findMaxSum(mat);
        
        if (res == -1) {
            System.out.println("Not possible");
        } else {
            System.out.println("Maximum sum of hour glass = "
                    + res);
        }
    }

}
