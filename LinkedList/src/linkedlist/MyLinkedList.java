package linkedlist;

import java.util.LinkedList;

public class MyLinkedList {

    Node head; //have a reference to the head
    int count; //need to know we're going to be at the end of the list

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyLinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }

    //add
    public void addNode(int newData) {
        Node temporaryNode = new Node(newData);
        if (head != null) {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(temporaryNode);
        } else {
            head = temporaryNode;
        }
        count++;
    }

    //get
    public int getNode(int index) {
        if (index <= 0 || index > count) {
            return -1;
        }
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    //size
    public int linkedListSize() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    //remove
    // remove from the back of the list
    public void remodeNode() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        System.out.println(myLinkedList.getNode(10));
        System.out.println("Size " + myLinkedList.linkedListSize());
        myLinkedList.remodeNode();
        System.out.println("Size " + myLinkedList.linkedListSize());

//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("Yeah!");
//        System.out.println(linkedList);
//        linkedList.add("Go!");
//        System.out.println(linkedList);
//        linkedList.addFirst("try first");
//        System.out.println(linkedList);
//
//        //Training
//        LinkedList<String> mine = new LinkedList<String>();
//        mine.add("First");
//        mine.add("Second");
//        mine.addFirst("Third");
//        mine.addLast("Fourth");
//        mine.add(2, "Fifth");
//        System.out.println(mine);
//        System.out.println(mine.get(2));
//        mine.clear();
//        System.out.println(mine);
//        mine.add("Sixth");
//        System.out.println(mine);
    }

}
