/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.string.to.integer;

import java.util.LinkedList;

/**
 *
 * @author mararosa
 */
public class ExceptionsStringToInteger {

    LinkedList<String> list;
    int[] intArray = new int[4];

    // For testing Null Pointer Exception
    ExceptionsStringToInteger() {
        this.list = null;
    }

    // For testing Index Out of Bounds
    ExceptionsStringToInteger(String str) {
        this.list = new LinkedList<String>();
        list.add(str);
    }

    void exceptionDemo(int i, String str) {
        try {
            int myInt = intArray[i]; //// throws ArrayIndexOutOfBoundsException if index > intArray.length
            list.indexOf(str); //// throws a NullPointerException if 'list' doesn't point to an actual list object
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("The following index is out-of-bounds: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.err.println("Oh no! You tried to perform an operation on an object whose value is null!");
        } 
        finally {
            System.out.println("This is printing regardless of wether or not the program finishes executing.");
        }
        System.out.println("The program was able to continue execution!\n");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ExceptionsStringToInteger resultNullList = new ExceptionsStringToInteger(); //// creates a Solution object whose 'list' instance variable points to null:
        resultNullList.exceptionDemo(1, "x"); //// attempt to access an element of the null list, throws Exception

        ExceptionsStringToInteger resultNotNullList = new ExceptionsStringToInteger("x"); //// creates a Solution object whose 'list' instance variable points to a list containing 1 element ("x"):
        resultNotNullList.exceptionDemo(100, "x"); //// attempt to access an invalid index of 'intArray' instance variable, throws Exception
    }

}
