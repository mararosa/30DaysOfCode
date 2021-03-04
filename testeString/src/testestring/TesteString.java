/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestring;

import java.util.Scanner;

/**
 *
 * @author edima
 */
public class TesteString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);

        System.out.println("Em que vc está pensando?");
        String myString = obj.nextLine();
        myString = myString.replace(" ", "");

        char[] myCharArray = myString.toCharArray();
        StringBuilder addEven = new StringBuilder();
        StringBuilder addOdd = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (i % 2 == 0) {
                addEven.append(myCharArray[i]);
            } else {
                addOdd.append(myCharArray[i]);
            }
        }

        System.out.println(addEven + " " + addOdd);
    }
}
