/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propagatedexception;

/**
 *
 * @author mararosa
 */
public class PropagatedException {

    void example() throws Exception {
        throw new Exception("This exception will always be thrown.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        PropagatedException p = new PropagatedException();
        try {
            p.example();
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

}
