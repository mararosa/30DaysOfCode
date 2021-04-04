/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author mararosa
 */
public class Dog {

    private int instancias;

    Dog() {

        instancias++;

    }

    public int getInstancias() {

        return instancias;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Dog bob = new Dog();

        Dog rex = new Dog();

        System.out.println("Imprime:" + rex.instancias + bob.instancias);
    }

}
