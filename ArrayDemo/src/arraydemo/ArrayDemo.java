package arraydemo;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        // initializing int array
        int[] array = new int[]{10, 22, 36};

        // let us print all the elements available in list
        System.out.println("The array is:");
        for (int number : array) {
            System.out.println("Number = " + number);
        }

        System.out.println("The string representation of array is:");
        System.out.println(Arrays.toString(array));

        // the number of elements we want to hold
        final int _arraySize = 4;

        // our array declaration
        String[] stringArray = new String[_arraySize];

        for (int i = 0; i < _arraySize; i++) {
            // assign value to index i
            stringArray[i] = "This is stored in index " + i;

            // print value saved in index i
            System.out.println(stringArray[i]);
        }
    }

}
