package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;
import utilities.ArraysUtility;
import utilities.MathUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
       /*
        String str = "aaaaaaaaaaaaaaabbbbbbbbbbb";


        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

    }

        */

//        String str = "Wooden Spoon";
//        StringUtility.printEachChar(str);

        int num1 = 2;
        int num2 = 3;

        int sum = MathUtility.sum(num1,num2);
        System.out.println(sum);
        System.out.println(MathUtility.subtraction(num1,num2));
        System.out.println(MathUtility.multiplication(num1,num2));
        System.out.println(MathUtility.division(3.5,3.5));
        System.out.println(MathUtility.isEven(2));
        System.out.println(MathUtility.isOdd(3));
        System.out.println(MathUtility.cube(3));
        System.out.println(MathUtility.square(2));










    }

}