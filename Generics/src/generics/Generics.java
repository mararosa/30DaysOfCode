/*
 * Copyright 2021 mararosa
 */
package generics;

/**
 * @author mararosa
 */
public class Generics {

    //T will be some type of data that extends comparable meaning it has a compare to function
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));

//        Generics K = new Generics();
//        System.out.println(findMax(k, k));
    }
}
