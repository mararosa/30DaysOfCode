/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondetails;

import java.util.Scanner;

/**
 *
 * @author mararosa
 */
public class PersonDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        "Archbishop Street"
        String address = s.next(); // s = "Archbishop"
        Then address += s.nextLine(); // s = s + " Street"
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scan.next();
        name = name + scan.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scan.nextInt();

        System.out.print("Enter Your E-mail: ");
        String email = scan.next();

        System.out.print("Enter Your Address: ");
        String address = scan.next();
        address += scan.nextLine();

        scan.close();

        System.out.println("-----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("E-mail: " + email);
        System.out.println("Address: " + address);
    }

}
