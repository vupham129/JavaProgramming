package day52_Map_FunctionalInterface;

import java.util.*;

public class HighestFrequencyOfArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            result.put(each, frequency);
        }

        int highestFrequency = Integer.MIN_VALUE;
        String element = "";

        for (Map.Entry<String, Integer> eachPair : result.entrySet()) {
            if(eachPair.getValue() > highestFrequency){
                highestFrequency = eachPair.getValue();
                element = eachPair.getKey();
            }
        }

        System.out.println(result);
        System.out.println("Element "+element+" has the highest frequency");



    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency

 */