package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        boolean result = number%2 == 0; // if the remainder of a number divided by 2 is zero, then it's evenly divisible by 2
        boolean result1 = number%3 == 0;
        boolean result2 = number%5 == 0;

        System.out.println(number + " is divisible by 2: " + result);
        System.out.println(number + " is divisible by 3: " + result1);
        System.out.println(number + " is divisible by 5: " + result2);





    }
}
/*
2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */