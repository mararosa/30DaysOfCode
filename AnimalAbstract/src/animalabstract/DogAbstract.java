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
public class DogAbstract extends AnimalAbstract{

    public DogAbstract() {
        super(15);
        System.out.println("A dog has been created");
    }

    public void ruff() {
        System.out.println("The dog says ruff");
    }

    public void run() {
        System.out.println("A dog is running");
    }

    @Override
    public void eat() {
        System.out.println("A dog is eating");
    }
    
    //public abstract eat();
    
    public void sleep() {
        System.out.println("A dog is sleeping");
    }
}
