package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequencyOfString {
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";
        // convert to String array
        String[] arr = str.split("");

        //create a new Map
        Map<String, Integer> result = new LinkedHashMap<>();

        // iterate and give condition to add the element to map result
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);
        }

        // find the max of frequency and return the key of the highest frequency
        int highestFrequency = Integer.MIN_VALUE;
        String highestFrequencyCharacter ="";
        for (Map.Entry<String, Integer> pair : result.entrySet()) {
            if(pair.getValue() > highestFrequency){
                highestFrequency = pair.getValue();
                highestFrequencyCharacter = pair.getKey();
            }
        }
        System.out.println(result);
        System.out.println("Character " + highestFrequencyCharacter + " has the highest frequency");


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */