/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.math.BigDecimal;

public class Metodos {

    public static void main(String[] args) {
        // TODO code application logic here
        Object numero = BigDecimal.ZERO;
        print(numero);
        print(numero.toString());
    }

    static void print(Object mensagem) {
        System.out.println("Object");
    }

    static void print(Number mensagem) {
        System.out.println("Number");
    }

    static void print(String mensagem) {
        System.out.println("String");
    }
}
