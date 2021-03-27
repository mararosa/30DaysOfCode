
package linkedlist;

public class Node {
    Node next; //reference
    int data; //data
    
    public Node(int newData) {
        data = newData;
        next = null;
    }
    
    public Node(int newData, Node newNext) {
        data = newData;
        next = newNext;
    }    
    
    public int getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setData(int newData) {
        data = newData;
    }
    
    public void setNext(Node newNext) {
        next = newNext;
        
    }
}
