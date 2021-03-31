/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacky;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author mararosa
 */
public class Stacky {

    LinkedList stack;

    public Stacky() {
        stack = new LinkedList();
    }

    // Is our stack empty?
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    // What is the size of our stack?
    public int size() {
        return stack.size();
    }
    // push an item
    public void push(int n) {
        stack.addLast(n);
    }
    // pop an item
    public int pop() {
        return (int) stack.removeLast();
    }
    // Peek at the first item
    public int peek() {
        return (int) stack.get(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stacky numberStack = new Stacky();
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        System.out.println("First item deleted: " + numberStack.pop());
        System.out.println("Second item deleted: " + numberStack.pop());
        System.out.println("Third item deleted: " + numberStack.pop());
        
//        Stack<String> stacky = new Stack<>();
//        stacky.push("Hi");
//        stacky.push("Mara");
//        System.out.print(stacky.pop() + " ");
//        System.out.println("Peek: " + stacky.peek());
//        System.out.println(stacky.pop() + "!");
//        System.out.println("Size: " + stacky.size());
    }

}
