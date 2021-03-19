/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizationpayroll;

/**
 *
 * @author mararosa
 */
public class Volunteer extends Employee {
    
    int hours;    

     /** Parameterized Constructor 
    * 	@param name The volunteer's name. **/
    public Volunteer(String name) {
        // explicit call to superclass' parameterized constructor
        super(name);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
    
    @Override
    void print() {
        System.out.println("Volunteer Name: " + this.getName() + "\nHours: " + this.getHours() + "\n");
    }
    
}
