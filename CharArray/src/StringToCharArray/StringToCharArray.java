/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringToCharArray;

/**
 *
 * @author mararosa
 */
public class StringToCharArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "hello";
        char[] ch1 = msg.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }
        System.out.println("---------------------");

        String s = "You are learning";
        char[] ch = s.toCharArray();
        int length = ch.length;

        System.out.println("Char array lenght: " + length);
        System.out.println("Char array elements ");

        for (int i = 0; i < length; i++) {
            System.out.println(ch[i]);
        }
    }

}
