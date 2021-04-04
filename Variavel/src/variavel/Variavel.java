/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variavel;

/**
 *
 * @author mararosa
 */
public class Variavel {

    static int x = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        print(x);
        System.out.print(x);
    }

    static void print(int x) {
        System.out.print(++x);
    }
}
