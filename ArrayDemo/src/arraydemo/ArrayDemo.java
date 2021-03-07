
package arraydemo;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        // initializing int array
        int[] array = new int[] {10,22,36};
        
        // let us print all the elements available in list
        System.out.println("The array is:");
        for (int number : array) {
            System.out.println("Number = " + number);
        }
        
        System.out.println("The string representation of array is:");
        System.out.println(Arrays.toString(array));
    }
    
}
