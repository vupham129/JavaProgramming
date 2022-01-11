package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabets = new char[26];// Z~A

       /* char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++, ch--) { // i: index number of character Z~A
            alphabets[i] = ch;
        }

        System.out.println(Arrays.toString(alphabets));// to print the whole Array
      //  System.out.println(alphabets[0]);// print the element of array

        */

        for (char i = 0, j = 'Z'; i < alphabets.length ; i++,j--) {
            alphabets[i]=j;
        }
        System.out.println(Arrays.toString(alphabets));// to print the whole Array








    }
}
