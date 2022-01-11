package day03_12_18_2021;

public class ThreeDigitsWithNestedLoop {
     /*
                writing three-digits numbers with nested loops
                hint:
                ABC=100*A+10*B+C
                220=100*2+10*2+0
                */
     public static void main(String[] args) {

          for (int i = 1; i < 10 ; i++) {
               for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                         int ijk = 100*i+10*j+k;
                         System.out.print(ijk + " ");
                    }
               }
          }



     }
}
