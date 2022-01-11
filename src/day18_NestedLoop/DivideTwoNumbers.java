package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 7;

        int count = 0; // count = 1+1=2+1=3+1=4
        while(a>=b){
            a-=b; // will be division result, how many times b substracted from a
            count++;
        }
        System.out.println(count+" with a remainder of "+a);






    }
}
/*
  1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

 */