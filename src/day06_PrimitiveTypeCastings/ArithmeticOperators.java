package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12"+1);//121, concatenation
        System.out.println(10+20); // 30, addition
        System.out.println(100-50); // 50, subtraction
        System.out.println(10*6); // 60, multiplication
        System.out.println(100/3);// 33
        System.out.println(10.0/4); // 2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10/4d);

        int a = 100;
        double b = a/6; // 16.0

        System.out.println(b);

        double c = (double)a/6.0; // 16.66666, casting, or add d behind 6
        System.out.println(c);

        System.out.println(100D);


    }

}
/*
+: Addition
-: Subtraction
*: multiplication
/: division
     integer / integer => integer result
     decimal / integer => decimal result
     integer / decimal => decimal
     decimal / decimal => decimal

      in math:
        10/4 = 2.5
        100/3 = 33.333...
      in Java:
         10/4 = 2
         10.0/4 = 2.5
         100/3 = 33
 */