package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647; //

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < min) { // if the user entered smaller than current minimum number
                min = num;
            }
        }
        System.out.println("min = " + min);


            scan.close();
    }
}
/*
Write a program that asks the user to enter for 5 times.

return the minimum number

 */