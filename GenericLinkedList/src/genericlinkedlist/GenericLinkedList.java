/*
 * Copyright 2021 mararosa
 */
package genericlinkedlist;

import java.util.LinkedList;

/**
 * @author mararosa
 */
public class GenericLinkedList<D> {

    GenericNode<D> head; //have a reference to the head
    int count; //need to know we're going to be at the end of the list

    public GenericLinkedList() {
        head = null;
        count = 0;
    }

    public GenericLinkedList(GenericNode<D> newHead) {
        head = newHead;
        count = 1;
    }

    //add
    public void add(D newData) {
        GenericNode<D> temporaryNode = new GenericNode(newData);
        if (head != null) {
            GenericNode currentNode = head;
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
    public D get(int index) {
        try {
            if (index <= 0 || index > count) {
                System.out.println("need change. because cannot return -1 anymore");
            }
        } catch (Exception e) {
            System.out.println("Exception thrown " + e);
        }

        GenericNode<D> currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    //size
    public int size() {
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
    public void remove() {
        GenericNode<D> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GenericLinkedList linkedList = new GenericLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(2));
        System.out.println("Size " + linkedList.size());
        linkedList.remove();
        System.out.println("Size " + linkedList.size());

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
