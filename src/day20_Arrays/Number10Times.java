package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number10Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for 10 times:");

        int[] number = new int[10];// 10 numbers


        for (int j = 0; j < 10; j++) { // j: index number of 10 numbers that user will enter
            number[j]= scan.nextInt();
        }

        System.out.println(Arrays.toString(number));

        int max = number[0]; // if there is element that greater than current max number
        for (int i = 0; i < number.length; i++) { //
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("Maximum number is: "+max);


        int min = number[0]; // if there is element that less than current min number
        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){
                min = number[i];
            }
        }
        System.out.println("Minimum number is: "+min);

        scan.close();



    }
}
/*
 3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */