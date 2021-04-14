/*
 * Copyright 2021 mararosa
 */
package sorting;

import java.util.Scanner;

/**
 * @author mararosa
 */
public class Sorting {

    private static void printArray(String s, int[] x) {
        System.out.println(s + " Array: ");
        for (int i : x) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] x) {
        printArray("Initial", x);

        int endPosition = x.length - 1;
        int swapPosition;

        while (endPosition > 0) {
            swapPosition = 0;

            for (int i = 0; i < endPosition; i++) {
                if (x[i] > x[i + 1]) {
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;

                    swapPosition = i;
                }
                printArray("Current", x);
            }
            endPosition = swapPosition;
        }
        printArray("Sorted", x);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade total de números no array vai ser...");
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            unsorted[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("-----------------");

        bubbleSort(unsorted);
    }
}
