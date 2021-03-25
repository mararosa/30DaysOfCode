/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difference;

import java.util.Arrays;

/**
 *
 * @author mararosa
 */
public class Difference {

    private int[] elements;
    public int maximumDifference;
    public int minimumValue = Integer.MAX_VALUE;
    public int maxValue = Integer.MIN_VALUE;

    // Add your code here
    Difference(int[] arr) {
        this.elements = arr;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            maxValue = Math.max(maxValue, elements[i]);
            minimumValue = Math.min(minimumValue, elements[i]);
        }
        maximumDifference = Math.abs(maxValue - minimumValue);
        System.out.println("computeDifference: " + maximumDifference);
    }

    void computeDifferenceII() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[(elements.length - 1)] - elements[0]);
        System.out.println("computeDifferenceII: " + maximumDifference);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {5, 2, 9, 1, 3};
        Difference difference = new Difference(arr);
        difference.computeDifference();
        difference.computeDifferenceII();
    }

}
