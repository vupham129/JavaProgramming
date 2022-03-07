package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

        // create a function that can check if the integer is contained in an array of int and return boolean at the end
        BiPredicate<Integer[], Integer> contains = (arr, n) -> {
            boolean result = false;
            for (Integer each : arr) {
                if(each==n){
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean result = contains.test(arr, 11);
        System.out.println("result = " + result);

        System.out.println("-----------------------------");

        // create a function that can check if two strings are anagram

        BiPredicate<String, String> anagram = (a,b) -> {
            boolean result1 = false;
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                result1 = true;
            }
            return result1;
        };

        System.out.println("anagram.test(\"abc\", \"bca\") = " + anagram.test("abc", "bca"));
        System.out.println("--------------------------------------");
        // create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printString = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printString.accept("Wooden Spoon", 10);

        System.out.println("----------------------------------");

        // create a function that takes first and last names and returns the formatted full name
        //"jAvA", "PROGRAMMING" ==> Java Programming

        BiConsumer<String, String> fullNameFormat = (a,b) -> {
          String firstName1 = a.substring(0,1);
          String firstName2 = a.substring(1);
          String lastName = b.substring(0,1);
          String lastName1 = b.substring(1);
          String fullName = firstName1.toUpperCase() + firstName2.toLowerCase() + " " + lastName.toUpperCase() +lastName1.toLowerCase();
            System.out.println(fullName);

        };

        fullNameFormat.accept("jAvA", "PROGRAMMING");

        System.out.println("--------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "QA");


        scrumTeam1.forEach(  (k, v) -> System.out.println(k+" : "+v) );

        System.out.println("--------------------------------------");

        //1. create a function that takes two integers and return the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a,b) -> (a>b)? a : b;

        int max = maxNum.apply(100,200);

        System.out.println("max = " + max);

        System.out.println("------------------------------------------");

        //2. create a function that can take 2 int array and merge them into a list
        BiFunction<int[], int[], List<Integer>> merge2Arrays = (x, y) -> {
            List<Integer> merge = new ArrayList<>();
            for (int each : x) {
                merge.add(each);
            }
            for (int each : y) {
                merge.add(each);
            }

            return merge;
        };
         int[] arr1 = {1,2,3,4,5};
         int[] arr2 = {6,7,8,9,10};

        System.out.println("merge2Arrays.apply(arr1, arr2) = " + merge2Arrays.apply(arr1, arr2));

        System.out.println("----------------------------------------");

        //3. create a function that takes a list of String, list of Integer, and return a Map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100,110}
                 */
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2ListsIntoMap = (l1, l2) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String each : l1) {
                for (Integer each1 : l2) {
                    map.put(each,each1);
                }
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Josh", "Daniel", "Aygun"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2ListsIntoMap.apply(names, scores);

        System.out.println(students);

    }
}
