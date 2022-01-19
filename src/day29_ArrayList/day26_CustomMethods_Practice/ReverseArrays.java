package day29_ArrayList.day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] reversedArr = reverse(arr);

        System.out.println(Arrays.toString(reversedArr));

        String[] a = {"A", "B", "C", "D", "E"};
        String[] reversed = ArraysUtility.reverse(a);

        System.out.println("reversed = " + Arrays.toString(reversed));
    }



   /* public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        int j = 0;//j: index number of result
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];
        }

        return result;
    }

    */
    // another way to reverse the array
    public static int[] reverse(int[] arr){
        int[] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }

        return result;
    }
}
