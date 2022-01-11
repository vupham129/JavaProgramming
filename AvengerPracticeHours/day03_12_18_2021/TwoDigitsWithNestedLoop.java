package day03_12_18_2021;

public class TwoDigitsWithNestedLoop {
     /*
                writing two-digits numbers with nested loops
                hint:
                AB=10*A+B
                10-11-12-...99
                */
     public static void main(String[] args) {

         for (int i = 1; i < 10 ; i++) {
             for (int j = 0; j < 10; j++) {
                 int ab = 10*i+j;
                 System.out.print(ab + " " );
             }

         }






     }
}
