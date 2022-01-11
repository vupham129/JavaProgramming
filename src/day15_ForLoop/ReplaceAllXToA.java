package day15_ForLoop;

import java.util.Scanner;

public class ReplaceAllXToA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        scan.close();
        String result = "";

        if(word.contains("x") || word.contains("X")){
           result = word.replace("x", "a").replace("X","a");
           //                    acodeX                         acodea
        }

        System.out.println(result);


    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */