/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalabstract;

/**
 *
 * @author mararosa
 */
public class CatAbstract extends AnimalAbstract {

    public CatAbstract() {
        super(7);
        System.out.println("A cat has been created");
    }

    public void meow() {
        System.out.println("A cat meows");
    }

    public void prance() {
        System.out.println("A cat is prance");
    }

    @Override
    public void eat() {
        System.out.println("A cat is eating");
    }

    //public abstract eat();
}
