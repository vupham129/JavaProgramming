package day25_CustomMethod_Overloading;

public class SumOfNumber {
    /*
    Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
     */

    public static void main(String[] args) {

        int sumOfTwoNums = sumOfTwoNum(100,200);
        int sumOfThreeNums = sumOfThreeNums(100,200,300);
        int sumOfFourNums = sumOfFourNums(100,200,300,400);

        System.out.println("sumOfTwoNums = " + sumOfTwoNums);
        System.out.println("sumOfThreeNums = " + sumOfThreeNums);
        System.out.println("sumOfFourNums = " + sumOfFourNums);

    }




    public static int sumOfTwoNum(int num1, int num2){
        int sum = num1+num2;
        return sum;

    }
    public static int sumOfThreeNums(int num1, int num2, int num3){
        int sum = num1+num2+num3;
        return sum;
    }
    public static int sumOfFourNums(int num1, int num2, int num3, int num4){
        int sum = num1+num2+num3+num4;
        return sum;
    }



}
