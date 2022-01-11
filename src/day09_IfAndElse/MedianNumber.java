package day09_IfAndElse;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20,
                b = 30,
                c = 10;
        //
        boolean bIsMedian = (b > a && b < c) || (b>c && b < a);
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a); // or !aIsMedian && !bIsMedian


        if(bIsMedian){
            System.out.println(b + " is the median number");
        }
        if(aIsMedian){
            System.out.println(a+ " is the median number");
        }
        if(cIsMedian){
            System.out.println(c+ " is the median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */