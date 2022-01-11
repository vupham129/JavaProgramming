package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
         int num1 = +25; // optional
        int num2 = -25; // not optional, it is for negative numbers

        System.out.println( num1 < 0); // false
        System.out.println(num2 <0); // true

        System.out.println("-----------------------");

        int a = 5;
        ++a; // pre increment: increases a value by 1 immediately

        System.out.println(a);

        --a; // pre decrement : decreases a value by 1 immediately

        System.out.println(a);

        System.out.println("---------------------------");

        int b = 100;

        System.out.println(++b); // pre increment: increases a value by 1 immediately

        int c = 100;

        System.out.println(c++); // post increment: pass the current value, then increase the value by 1
        System.out.println(c); // 101, it is the second step if you want to get the result 101, the next step

        System.out.println("----------------------------------");

        int x = 200;

        System.out.println(--x); //199 pre decrement: decrease the value by 1 immediately

        int y = 200;

        System.out.println(y--); // post decrement: first pass the value, then decrease the value by 1
        System.out.println(y); //199

        System.out.println("--------------------------------");

        int z = 45;

        System.out.println(++z); // 46, pre increment z = 46
        System.out.println(z++); // 46 , post increment: pass the current value
        System.out.println(z); // z = 47

        int q = 30;
        System.out.println(--q); // 29, q = 29, pre decrement
        System.out.println(q--); // 29, q = 28, post decrement
        System.out.println(q); // 28





    }

}
