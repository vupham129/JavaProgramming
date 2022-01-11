package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 200.5, n2 = 10.5;
        char operator = '%';


        boolean valid = operator=='+'||operator=='-'||operator=='*'||operator=='/';

        if(valid){ // + - * /
            switch (operator){ // can not contain double, long, float, boolean
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
                    break;


            }
        }else{ //
            System.err.println("Invalid Operator: "+ operator);
        }








    }
}
/*
given two double variables n1, n2 and a char variable names operator
use switch statement to calcualte the result of n1 & n2 based one the given operator
-, +, *, /
 */