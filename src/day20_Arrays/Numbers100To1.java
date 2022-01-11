package day20_Arrays;

import java.util.Arrays;

public class Numbers100To1 {
    public static void main(String[] args) {
        int[] num = new int[100];
       /* int num1 = 100; // the last number in array
        for (int i = 0; i < 100 ; i++, num1--) { // i: index number of num from 100~1
                num[i] = num1;
        }

        */
        for (int i = 0, j = 100; i < num.length ; i++, j--) {
            num[i]=j;
        }
        System.out.println(Arrays.toString(num));




    }
}

/*
 2. create an array that has the numbers 100 to 1
 */