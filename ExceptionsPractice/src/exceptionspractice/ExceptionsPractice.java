package exceptionspractice;

public class ExceptionsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
//        //checked exception
//        int[] arr = new int[10](); 
//        //unchecked exception
//        int[] arr2 = new int[10];
//        System.out.println(arr[10]);

        try {
//            int[] c = new int[5]; //catch
            int[] c = new int[6]; //try
            System.out.println("Sixth element at index 5 = " + c[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally clause");
        }
//        System.out.println("Finally finished try-catch");
    }

}
