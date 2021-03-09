/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexample;

/**
 *
 * @author mararosa
 */
public class RecursionExample {

    
    // Multiply 'n' by 'k' using addition:
    private static int nTimesK(int n, int k) {
        System.out.println("n: " + n);
        // Recursive Case
        if (n > 1) {
            // 4 + nTimesK(3,4)
            // 4 + 4 + nTimesK(2,4)
            // 4 + 4 + 4 nTimesK(1,4)
            // 4 + 4 + 4 + 4
            return k + nTimesK(n - 1, k);
        } // Base Case n = 1
        else {
            return k;
        }
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        int result = nTimesK(4, 4);
        System.out.println("Result: " + result);
    }

}
