/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melitest;

/**
 *
 * @author mararosa
 */
public class Melitest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxDigit = 7;
        int result = 21;
		for (int a = 1; a <= maxDigit; a++) {
			for (int b = 1; b <= maxDigit; b++) {
				for (int c = 1; c <= maxDigit; c++) {
					for (int d = 1; d <= maxDigit; d++) {
						if (a + b + c + d == result) {
                                                        System.out.println(a + " " + b + " " + c + " " + d );
						}
					}
				}
			}
		}
    }
    
}
