package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;

        // 100 + 50 = 150
        int addition = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        // 100 - 50 = 50
        int subtraction = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);


        // 100 * 50 = 5000
        int multiply = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
    }

}
