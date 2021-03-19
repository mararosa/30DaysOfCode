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
public class OrganizationPayroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee = new Employee("Snoopy");
        employee.print();
        employee.setSalary(27979);
        employee.print();
        
        Volunteer volunteer = new Volunteer("Tobias");
        volunteer.setHours(40);
        volunteer.print();
    }
    
}
