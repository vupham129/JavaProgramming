package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String w = sc.next();

        sc.close();
        String result = "";

        for (int i = 0; i < w.length(); i++) {
            String ch = ""+w.charAt(i);
            if(w.indexOf(ch) == w.lastIndexOf(ch)){// if the first and last index number of character are same, then the char is unique
                    result += ch;

            }

        }
        System.out.println(result);


    }
}
/*
 2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */