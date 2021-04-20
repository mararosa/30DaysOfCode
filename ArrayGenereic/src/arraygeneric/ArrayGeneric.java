/*
 * Copyright 2021 mararosa
 */
package arraygeneric;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author mararosa
 */
public class ArrayGeneric {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
//    // Can have many as generics you want
//     public static <E, T> E[] printArray(E[] array, T something) {
//        for (E element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        return array;
//    }
     
//       // When you want the arguments want to be the same data type
//     public static <E, T> E[] printArray(E[] array, E something) {
//        for (E element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        return array;
//    }

    public static void main(String[] args) {

        // Random Objects from Array:
        //Math.abs(rand.nextInt) % 5;
        //Declaring, Allocating, and Initializing
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 37;
        intArray2[3] = 3;

        // Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out Arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);

        // Print string array
        printArray(shoppingList);

        System.out.println("Special For Loop:");
        // Special For Loop: Foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
