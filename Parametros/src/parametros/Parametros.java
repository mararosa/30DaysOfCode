/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

/**
 *
 * @author mararosa
 */
public class Parametros {

    static int param = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        print(param);
        print();
        System.out.print(param);
    }

    static void print() {
        System.out.print(++param);
    }

    static void print(int param) {
        System.out.print(++param);
    }
}
