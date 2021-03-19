/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizationpayroll;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author mararosa
 */
public class Employee {
    
    protected String name;
    private int salary;

    //Parameterized Constructor 
    public Employee(String name) {
        // use name param to initialize instance variable:
        this.name = name;
    }

    /** @return The name instance variable. **/
    public String getName() {
        return name;
    }

     /** @param salary The integer to set as the salary instance variable. **/
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    /** @return The salary instance variable. **/
    public int getSalary() {
        return salary;
    }
    
    /** Print information about an instance of Employee. **/
    void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for " + this.name + 
                    "; Please set salary and try again.\n");
        } else {
            // Formatter for salary that will add commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getCurrencyInstance(Locale.US);
            
            System.out.println("Employee Name: " + this.name + "\nSalary: " 
                    + salaryFormat.format(this.salary) + "\n");
        }
    }
    
   
    
    
  
    

    
    
}
