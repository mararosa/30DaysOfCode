/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarynumbers;

import java.util.Scanner;

/**
 *
 * @author mararosa
 */
public class DecimalToBinary {

    public String ConvertDecimalToBinary(int n) {

        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("How many conversions do you want to do?");
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("Enter the decimal number you want to convert to binary");
            int decimal = scan.nextInt();
            DecimalToBinary decimalToBinary = new DecimalToBinary();
            String binary = decimalToBinary.ConvertDecimalToBinary(decimal);
            System.out.println(binary);
        }
    }

}
