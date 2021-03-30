package queuey;

import java.util.LinkedList;
import java.util.Queue;

public class Queuey {

    LinkedList queue;

    // Making a queue instance
    public Queuey() {
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
    public void enqueue(String n) {
        queue.addLast(n);
    }
    
    // Dequeueing an item
    public String dequeue() {
        return (String) queue.remove(0);
    }

    // Peek at the first item
    public String peek() {
        return (String) queue.get(0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("Mara");
        System.out.print(stringQueue.dequeue()+ " ");
        System.out.print(stringQueue.dequeue() + ".");
        
//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out: " + numberQueue.dequeue());
//        System.out.println("Peek at first item: " + numberQueue.peek());
//        System.out.println("Second out: " + numberQueue.dequeue());
//        System.out.println("Third out: " + numberQueue.dequeue());
    }

}
