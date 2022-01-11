package day25_CustomMethod_Overloading;

public class ReverseArray {
    /*
    Task 6:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array

     */

    public static void main(String[] args) {







    }
    
    public static int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];

        int j =0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        
        return reverse;
        
    }
    public static double[] reverseArray(double[] arr){
        double[] reverse = new double[arr.length];

        int j =0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }
    public static char[] reverseArray(char[] arr){
        char[] reverse = new char[arr.length];

        int j =0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }
    public static String[] reverseArray(String[] arr){
        String[] reverse = new String[arr.length];

        int j =0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }
    
    
    
}
