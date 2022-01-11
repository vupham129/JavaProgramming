package day25_CustomMethod_Overloading;

public class MergeArrays {
    /*
    Task3:
	1. create a method that can merge two integer arrays

	2. create a method that can merge two double arrays

	3. create a method that can merge two char arrays

	4. create a method that can merge two String arrays

     */


    public static void main(String[] args) {






    }
    public static int[] merge(int[] arr1, int[] arr2 ){
        int[] merge = new int[arr1.length+ arr2.length];
        int j = 0;
        for (int each : arr1) {
            merge[j++]=each;
        }
        for (int each : arr2) {
            merge[j++]=each;
        }
        return merge;
    }
    public static double[] merge(double[] arr1, double[] arr2 ){
        double[] merge = new double[arr1.length+ arr2.length];
        int j = 0;
        for (double each : arr1) {
            merge[j++]=each;
        }
        for (double each : arr2) {
            merge[j++]=each;
        }
        return merge;
    }
    public static String[] merge(String[] arr1, String[] arr2 ){
        String[] merge = new String[arr1.length+ arr2.length];
        int j = 0;
        for (String each : arr1) {
            merge[j++]=each;
        }
        for (String each : arr2) {
            merge[j++]=each;
        }
        return merge;
    }
    public static char[] merge(char[] arr1, char[] arr2 ){
        char[] merge = new char[arr1.length+ arr2.length];
        int j = 0;
        for (char each : arr1) {
            merge[j++]=each;
        }
        for (char each : arr2) {
            merge[j++]=each;
        }
        return merge;
    }



}
