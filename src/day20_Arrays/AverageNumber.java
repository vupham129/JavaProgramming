package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt();

        if(length<= 0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length];// length: how many times the user want to enter
        int averageNumber = 0;
        int total = 0;
        for (int i = 0; i < numbers.length; i++) { // i: index number of the numbers that user want to enter
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();

            total = total + numbers[i]; // total of numbers of the array
            averageNumber = total / length; // total of numbers of the array / how many numbers that user entered

        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Average number is: "+averageNumber);






        scan.close();










    }
}
