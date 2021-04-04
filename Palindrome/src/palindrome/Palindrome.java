/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mararosa
 */
public class Palindrome {

    LinkedList queue;
    LinkedList stack;

    public Palindrome() {
        queue = new LinkedList();
        stack = new LinkedList();
    }

    public LinkedList getQueue() {
        return queue;
    }

    public LinkedList getStack() {
        return stack;
    }

    public void setQueue(LinkedList newQueue) {
        queue = newQueue;
    }

    public void setStack(LinkedList newStack) {
        stack = newStack;
    }

    public void pushCharacter(char ch) {
        getStack().addLast(ch);
    }

    public void enqueueCharacter(char ch) {
        getQueue().addLast(ch);
    }

    public char popCharacter() {
        return (char) getStack().removeLast();
    }

    public char dequeueCharacter() {
        return (char) getQueue().removeFirst();
    }

    public int size() {
        return getStack().size();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Let's check if the word is a palindrome. Type something: ");
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] StringToCharArray = input.toCharArray();

        Palindrome p = new Palindrome();
        // Enqueue/Push all chars to their respective data structures:
        for (char c : StringToCharArray) {
            p.enqueueCharacter(c);
            p.pushCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < StringToCharArray.length; i++) {
            if (p.dequeueCharacter() != p.popCharacter()) {
                isPalindrome =  false;
                System.out.println(p.getStack());
                System.out.println(p.getQueue());
                break;
            }
      
        }
                   System.out.println("getStack"+p.getStack());
                System.out.println("getQueue"+p.getQueue());
        
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a "
                + "palindrome." : "a palindrome."));  
    }

}
