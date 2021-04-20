/*
 * Copyright 2021 mararosa
 */

package genericlinkedlist;

/**
 * @author mararosa
 */

public class GenericNode<D> {
    
    GenericNode<D> next; //reference
    D data; //data
    
    public GenericNode(D newData) {
        data = newData;
        next = null;
    }
    
    public GenericNode(D newData, GenericNode newNext) {
        data = newData;
        next = newNext;
    }    
    
    public D getData() {
        return data;
    }
    
    public GenericNode<D> getNext() {
        return next;
    }
    
    public void setData(D newData) {
        data = newData;
    }
    
    public void setNext(GenericNode<D> newNext) {
        next = newNext;
        
    }
}


