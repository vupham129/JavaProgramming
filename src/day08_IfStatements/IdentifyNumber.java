package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;

        boolean result = number > 0;
        boolean result1 = number < 0;
        boolean result2 = number == 0;

        System.out.println(number + " is positive number: " + result);
        System.out.println(number +  " is negative number: " + result1);
        System.out.println(number + " is zero: " + result2);
    }
}
/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */