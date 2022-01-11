package day13_String;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        String word = "Cydeo";
        // index:      01234
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);
/*
        char tenthChar = word.charAt(9); // out of range of String word

        System.out.println("tenthChar = " + tenthChar);


 */

        System.out.println("--------------------------");

        String s1 = "Batch 25 is the best batch";
        //  include space as well within the double quote

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(totalChars-1);
        // char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();// create the new String object "WOODEN SPOON"

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
         sentence = sentence.toUpperCase();

        System.out.println(sentence); //TODAY IS A GREAT DAY TO LEARN JAVA PROGRAMMING LANGUAGE.











    }
}
