/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canine;

/**
 *
 * @author mararosa
 */
/**
 * Superclass *
 */
abstract public class Canine {

    String name;
    String color;
    String gender;
    int age;

    public Canine(String name, String color, int age, char mF) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = (mF == 'M') ? "Male " : "Female ";
    }

    /**
     * Abstract method declaration
     *
     * @return Implementations should return a string describing the breed *
     */
    abstract String getBreed();

    void printInfo() {
        System.out.println(name + " is " + ((age % 10 == 8) ? "an " : "a ")
                + age + " year old " + gender + getBreed() + " with a " + color
                + " coat.");
        // note: the '(age%10 == 8)' conditional ensures grammatical correctness if dog is 8 or 18; dogs do not live longer than this.
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Canine c = new KleeKai("Jully", "Grey/champagne", 12, 'F');
        Canine d = new SiberianHusky("Noopy", "White", 10, 'M');
        c.printInfo();
        d.printInfo();
    }

}
