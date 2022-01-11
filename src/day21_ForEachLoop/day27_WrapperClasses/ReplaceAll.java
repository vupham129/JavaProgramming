package day21_ForEachLoop.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        arr = replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));
        arr = replaceAll(arr, 300, 500);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"Java", "Python", "C#", "Python", "Python"};
        arr2 = replaceAll(arr2,"Python", "Ruby");
        System.out.println(Arrays.toString(arr2));


    }

    //Replace all the matching old elements of the array with new element
    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(oldElement)){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    public static class RemoveDuplicatesArrays {
        public static void main(String[] args) {
            int[] arr = {1,1,1,2,2,3,3,4,4,5,6,7};

            int[] removeDup = removeDuplicates(arr);

            System.out.println(Arrays.toString(removeDup));



        }
        public static int[] removeDuplicates(int[] array){
            int[] result ={};

            for (int each : array) {
                if(!ArraysUtility.contains(result,each)){
                    result = ArraysUtility.addElement(result,each);
                }
            }
            return result;

        }
    }
}
/*
 2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
        2.2 Create the same functions for double arrays, char arrays, and String arrays


 */