package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        for (char i = 'A', j = 0; i <='Z'&& j<letters.length; i++, j++) {// j: index number 0~last index; i:A~Z
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));// A~Z

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;

        }

        System.out.println("-------------------------------");





























    }
}
