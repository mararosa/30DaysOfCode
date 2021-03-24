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
public abstract class AnimalAbstract {

    private int age;

    public AnimalAbstract(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    
    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        DogAbstract d = new DogAbstract();
        CatAbstract c = new CatAbstract();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep(); 
        
        // Casting
        Object dog = new DogAbstract();
        DogAbstract realDog = (DogAbstract) dog;
        realDog.ruff();
        
        Object str = "est";
        String realString = (String) str;
        realString.getBytes();
        
        // What happens when...
        DogAbstract doggy = new DogAbstract();
        if (doggy instanceof AnimalAbstract) {
            AnimalAbstract animal = (AnimalAbstract) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
}
