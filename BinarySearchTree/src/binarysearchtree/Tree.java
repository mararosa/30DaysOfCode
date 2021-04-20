/*
 * Copyright 2021 mararosa
 */
package binarysearchtree;

/**
 *
 * @author mararosa
 */
public interface Tree<D extends Comparable> {
    
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D element);
    //Is going to be a public non-emptyBST that is going to hold type <D> and we are gonna add out D element
    public NonEmptyBST<D> add(D element); //means I am gonna create a NonEmpty binary search tree when I add something
    
}
