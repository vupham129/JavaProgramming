package Practice_12_15_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number = input.nextInt();
        /*
        int num0 = 0;
        int num1 = 1;
        int result = 0;

        System.out.println(num0);
        System.out.println(num1);

        for(int i = 2; i<number;i++) {
            result = num0 + num1; // 0+1=1
            System.out.println(result);
            num0 = num1; //num1=1
            num1 = result; //num1=1

        }

         */

        // use Array
        int[] fibonacci = new int[number];
        fibonacci[0]=0;// 1st number of fibonacci
        fibonacci[1]=1;// 2nd number of fibonacci

        for(int i = 2; i <number; i++) {// i: index number of fibonacci array
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
           // index number 3 = index(3-1) + index(3-2)
            // index number 3 = index 2   + index 1
            // index number of 3 is 2 = index of 2 is number 1 + index of 1 is number 1
        }
        System.out.println(Arrays.toString(fibonacci));









    }


}
