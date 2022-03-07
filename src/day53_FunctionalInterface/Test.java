package day53_FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        //1. Create a function that takes one integer and returns the cube of the given argument
        MyThirdFunctionalInterface<Integer> cube = (n) -> {
            System.out.println("cube of integer number = " + (n*n*n));
        };
        cube.apply(5);

        //2. Create a function that takes a String and returns the reversed value of the given argument
        MyThirdFunctionalInterface<String> reversedString = (str) -> {
            String result ="";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            System.out.println(result);
        };

        reversedString.apply("Wooden Spoon");

    }

}
/*
2.1 Create a class named Test and use the custom functional interface above to create the following functions:


 */