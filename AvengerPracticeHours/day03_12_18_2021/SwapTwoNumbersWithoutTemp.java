package day03_12_18_2021;

public class SwapTwoNumbersWithoutTemp {
    /*
int a =10;
int b=15;
int a=15;
int b=10;
int temp=a;
int a=b;
int b=temp;
 */
    public static void main(String[] args) {
         int a = 15;
         int b = 10;

         int ab = a+b; // 15+10 = 25
        b = ab - b; // 25 - 10=15
        a = ab - b; // 25 - 15 = 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);







    }
}
