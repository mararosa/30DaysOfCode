/*
 * Copyright 2021 mararosa
 */
package genericqueuey;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author mararosa
 */
//Anything inside of the queuey will do the generic
public class GenericQueuey<D> {

    //Guarantee everything inside of the linked list is going to be type <D>
    LinkedList<D> queue;

    // Making a queue instance
    public GenericQueuey() {
        queue = new LinkedList(); //Initialize the LinkedList
    }

    // Is our queue empty?
    public boolean IsEmpty() {
        return queue.isEmpty();
    }

    // What is the size of our queue?
    public int size() {
        return queue.size();
    }

    // Enqueueing an item
    public void enqueue(D n) {
        queue.addLast(n);
    }

    // Dequeueing an item
    //About generic when we dequeue we know will be of type <D> because anything that we enqueue was of type <D> 
    public D dequeue() {
        return queue.remove(0);
    }

    // Peek at the first item
    public D peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> stacky = new Stack<>();
        stacky.push("LivroA");
        stacky.push("LivroB");
        System.out.println(stacky.pop() + " ---Last in, First out");
        System.out.println("Peek: " + stacky.peek());
        System.out.println(stacky.pop() + "!");
        System.out.println("Size:" + stacky.size());

        GenericQueuey stringQueue = new GenericQueuey();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("Mara");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.print(stringQueue.dequeue() + ".");
        System.out.println("");

        GenericQueuey numberQueue = new GenericQueuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at first item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }

}
