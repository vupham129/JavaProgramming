package day20_Arrays;

import java.util.Arrays;

public class Number1To100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 1, j = 0; i <= 100&& j <100 ; i++, j++) {// i: the number from 1 to 100; j: the index number of i
            numbers[j]=i;
        }
        System.out.println(Arrays.toString(numbers));


    }
}
/*
 1. create an array that has the numbers 1 to 100
 */