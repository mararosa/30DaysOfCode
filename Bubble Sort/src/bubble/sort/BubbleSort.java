/*
 * Copyright 2021 mararosa
 */
package bubble.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mararosa
 */
public class BubbleSort {

    static int n = 4;

    public static void sorted(int[] a) {
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                System.out.println("chegou aqui");
                break;
            }
        }
    }

    public static void swap(int[] values, int w, int z) {
        int tmp = values[w];
        values[w] = values[z];
        values[z] = tmp;
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {4, 3, 1, 2};
        System.out.println(Arrays.toString(arr));
        sorted(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
