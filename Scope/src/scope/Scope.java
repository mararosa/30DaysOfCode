/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author mararosa
 */
public class Scope {

    boolean b = true;
    int x = 88;

    Scope() {
        double d = 9.0;
        example(d);
        classVariable();
    }

    void example(double x) {
        System.out.println("------- example(double x):\n" + "Initial value "
                + "of Local variable `x`: " + x + "\n");
        
        x = 4.4;

        System.out.println("New value of Local Variable `x`: " + x + "\n");
        
        for(int b = 0; b < 4; b++){ 
            int i = b + 4;
            System.out.println(	"For Loop 1 in example(double x):\n"
                + 	"Local Variable `b` (local to loop): " + b + "\n" 
                +	"Local Variable `i` (local to loop): " + i + "\n" 
                + 	"Local Variable `x` (method parameter): " + x + "\n"); 
        }

        for (int b = 0; b < 4; b++) {
            x = b;
            System.out.println("For Loop 2 in example(double x):\n"
                    + "Local Variable `b` (local to loop): " + b + "\n"
                    + "Local Variable `x` (method parameter): " + x + "\n");
        }

        System.out.println("Local Variable `x` after Loop 2: " + x + "\n");
    }

    void classVariable() {
        System.out.println("------------ classVariable():\n"
                + "Instance Variable `b`: " + b + "\n"
                + "Instance Variable `x`: " + x + "\n");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scope scope = new Scope();
    }
}
