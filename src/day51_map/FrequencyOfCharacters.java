package day51_map;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        String[] arr = str.split("");


        Map<String, Integer> result = new LinkedHashMap<>();//{b=2, c=3, a=5}

        for (String each : arr) { // each: characters of string
            result.put(each, Collections.frequency( Arrays.asList(arr), each) );
        }

        System.out.println("result = " + result);










    }
}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}

 */