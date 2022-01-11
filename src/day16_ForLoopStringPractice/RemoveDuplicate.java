package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String w = sc.next();

        sc.close();

        String result = "";
        for(int i = 0; i < w.length(); i++){// i: index numbers to take every single character of a string
            String ch = "" + w.charAt(i); // represents each character of str
            if( !result.contains(ch) ) { // if the character is not contained in the result
                result += ch; // the character will be added to the result
            }


        }

        System.out.println(result);


    }
}
/*
1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

    2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

 */