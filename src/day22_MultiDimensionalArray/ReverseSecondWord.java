package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reversedSecondWord = ""; // oveL

        for (int i = words[1].length() -1; i >= 0; i--) {
           reversedSecondWord += words[1].charAt(i);

        }
        System.out.println(reversedSecondWord);

        //sentence = sentence.replaceFirst(words[1], reversedSecondWord);
       // System.out.println(sentence);

        words[1]=reversedSecondWord;
        for (String word : words) {
            System.out.print(word+" ");
        }

    }
}
/*
2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */