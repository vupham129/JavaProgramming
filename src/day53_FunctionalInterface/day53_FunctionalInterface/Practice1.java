package day53_FunctionalInterface.day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        //Use ListFunction functional interface to:
        //		1.1 Create a function that can return the maximum number from a list of Integer
        ListFunction<List<Integer>, Integer> maxNumber = (p) -> {
            Integer max = p.get(0);
            for (int i = 0; i < p.size(); i++) {
                if(p.get(i) > max){
                    max = p.get(i);
                }
            }
            return max;
        };
        List<Integer> list = new ArrayList<>(Arrays.asList(10,500,200,300,550,600));
        System.out.println("maxNumber.apply(list) = " + maxNumber.apply(list));
        //		1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<List<Integer>, Integer> minNumber = (p) -> {
            Integer min = p.get(0);
            for (int i = 0; i < p.size(); i++) {
                if(p.get(i) < min){
                    min = p.get(i);
                }
            }
            return min;
        };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10,500,200,300,550,600));
        System.out.println("minNumber.apply(list1) = " + minNumber.apply(list1));

        //		1.3 Create a function that can return the longest String from a List of String
        ListFunction<List<String>, String> longestString = (p) -> {
            Integer longest = p.get(0).length();
            String longestStr = "";
            for (String each : p) {
                if(each.length() > longest){
                    longestStr = each;
                }
            }
            return longestStr;
        };
        List<String> words = new ArrayList<>(Arrays.asList("Anna", "Nurlan", "Nunu", "Amy"));
        System.out.println("longestString.apply(words) = " + longestString.apply(words));
        //		1.4 Create a function that can return the shortest String from a List of String
        ListFunction<List<String>, String> shortestString = (p) -> {
            Integer shortest = p.get(0).length();
            String shortestStr = "";
            for (String each : p) {
                if(each.length() < shortest){
                    shortestStr = each;
                }
            }
            return shortestStr;
        };
        List<String> words1 = new ArrayList<>(Arrays.asList("Anna", "Nurlan", "Nunu", "Amy"));
        System.out.println("shortestString.apply(words1) = " + shortestString.apply(words1));

        //		1.5 Create a function that can convert List of integer to int array
        ListFunction<List<Integer>, Integer[]> convertToIntArray = (p) -> {
            Integer[] arr = new Integer[p.size()];
            arr = p.toArray(arr);
            return arr;
        };
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer[] array = convertToIntArray.apply(list2);
        System.out.println("array = " + Arrays.toString(array));
        //		1.6 Create a function that can convert List of double to double array
        ListFunction<List<Double>, Double[]> convertToDoubleArray = (p) -> {
            Double[] arr = new Double[p.size()];
            arr = p.toArray(arr);
            return arr;
        };
        List<Double> list3 = new ArrayList<>(Arrays.asList(1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5,9.5));
        Double[] array1 = convertToDoubleArray.apply(list3);
        System.out.println("array1 = " + Arrays.toString(array1));
    }
}
