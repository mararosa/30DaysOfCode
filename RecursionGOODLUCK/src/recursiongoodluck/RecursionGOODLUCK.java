package recursiongoodluck;

public class RecursionGOODLUCK {

    /* In this case "mathematical"  
    Our Base Case is: How many Fs we had. Once we ran out of the numbers times f happened we were done.
    Our Recursive case was addinf of 5. 
     */
    // f(f(f(a))) = a = 20
    // f(a) = 5 + 20
    // f(20) = 5 + 20 = 25
    // f(f(f(20))) --- f(f(25)
    // f(25) = 5 + 25 = 30
    // f(f(f(20))) --- f(f(25) --- f(30)
    // f(30) = 5 + 30 = 35
    // f(f(f(20))) --- f(f(25) --- f(30) --- 35
    // 3 + 2 + 1
    public static int Summation(int n) {
        // Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0; // additive identity property 
        } //Recursive Case: KEEP GOING
        else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            return n + Summation(n - 1);
        }
    }

    // 4! --> 4 * 3 * 2 * 1 
    // 4! --> 4 * 3!
    public static int Factorial(int n) {
        //Base Case
        if (n <= 1) {
            return 1; // Multiply identity property 
        } // Recursive Case
        else {
            // Factorial(4) = 4 * Factorial(3)
            // 4 * 3 * Factorial(2)
            // 4 * 3 * 2 * Factorial(1)
            // 4 * 3 * 2 * 1
            return n * Factorial(n - 1);
        }
    }

    // 5^3 = 5 * 5 * 5
    // 5^3 = 5 * 5^2 ==> 5 * 5 * 5^1 ==> 5 * 5 * 5 * 5^0 ==> 5 * 5 * 5 * 1
    public static int Exponentiation(int n, int p) {
        //Base Case
        if (p <= 0) {
            return 1; //Multiply identity property 
        } // Recursive
        else {
            // 5 * Exponentiation(5, 2)
            // 5 * 5 * Exponentiation(5, 1)
            // 5 * 5 * 5 * Exponentiation(5, 0)
            // 5 * 5 * 5 * 1
            return n * Exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 3));
    }

}
