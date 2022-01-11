package day15_ForLoop;

import java.util.Scanner;

public class ReplaceXToA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String w = scan.next();

        scan.close();

        String result = "";

        if(w.indexOf('x')==0){ // or w.charAt(0) == 'x'
            result = w.replaceFirst("x", "a");
        }else {
            result = w;
        }

        System.out.println(result);


    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */