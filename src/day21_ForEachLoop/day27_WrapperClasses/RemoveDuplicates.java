package day21_ForEachLoop.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4};

        arr = ArraysUtility.removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------");

        String[] arr2 = {"Java", "Java", "Python", "C#", "Java", "Java",};

        arr2 = ArraysUtility.removeDuplicates(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("=============================");

        int[] numbers = {1,1,1,2,2,2,2,3,3,3,4,4,4,4};

        numbers = Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if( !ArraysUtility.contains(array,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }



}
