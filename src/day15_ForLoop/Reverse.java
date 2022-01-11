package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a word");
       String word = scan.next();
       // String word = "Java";
        String reverse = "";

//        for(int i = word.length()-1; i >= 0; i--){
////            reverse =reverse+word.charAt(i);
/*
        for (int i = word.length()-1 ; i >= 0;  i--){

            reverse=reverse+word.charAt(i);  // a+v+a+J

        }
        System.out.print(reverse);

 */

        StringBuffer str = new StringBuffer(word);
        str.reverse();
        System.out.println(str);





    }
}
/*
Java => avaJ
 */