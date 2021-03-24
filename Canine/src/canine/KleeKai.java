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

//** Subclass of Canine **/
public class KleeKai extends Canine{
    
    /** Parameterized Constuctor **/
    public KleeKai(String name, String color, int age, char mF) {
        super(name, color, age, mF);
    }
    
    /** Abstract method implementation
    *   @return "Klee Kai" **/
    @Override
    String getBreed() {
        return "Klee Kai";
    } 
}
