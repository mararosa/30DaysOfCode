/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrays;

/**
 *
 * @author mararosa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rowSize = 2;
        int colSize = 4;
        int[][] myArray = new int[rowSize][colSize];
        int count = 0;

        for (int i = 0; i < rowSize; i++) {

            // print the row of space-separated values
            for (int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
                System.out.print(count + " ");
            }
            // end of row is reached, print newline
             System.out.println();
        }
    }

}
