package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Collections.*;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return (reverse.equalsIgnoreCase(p));
        };

        boolean result = isPalindrome.test("anna");

        System.out.println("result = " + result); // true

        Predicate<Integer> isEven = (p) -> p%2==0;

        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));

        list.removeIf(isEven);

        System.out.println(list);

        System.out.println("-------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("level", "anna", "java", "python") );

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("----------------------------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("----------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if(each%2 !=0 ){
                System.out.println(each);
            }
        }

         */

        list2.forEach(p-> {
            if(p%2 != 0) System.out.println(p);
        });
        System.out.println("----------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach( s -> System.out.println( s.charAt(0) + "." +s.charAt(s.lastIndexOf(" ")+1) ));

        System.out.println("----------------------------------");
        Function<int[], List<Integer>> convertToList = (arr) -> {
            List<Integer> result1 = new ArrayList<>();
            for (int each : arr) {
                result1.add(each);
            }
            return result1;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("----------------------------------");
        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result2 = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result2[i] = a.get(i);
            }
            return result2;
        };

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int[] numbers1 = convertToArray.apply(l1);
        System.out.println("numbers1 = " + Arrays.toString(numbers1));

        System.out.println("----------------------------------");

        // create a function that can return the maximum number from an int array --> Function functional interface
        Function<int[], Integer> maxNumber = (p) -> {
            int max = p[0];
            for (int i = 0; i < p.length; i++) {
                if(p[i] > max ){
                    max = p[i];
                }
            }
            return max;
        };
        int[] arr2 = {1,2,3,45,6,7,8,9,50,40};
        System.out.println("maxNumber.apply(arr2) = " + maxNumber.apply(arr2));

        System.out.println("----------------------------------");
        // create a function that can swap the first and last elements of an array
        Function<int[], int[]> swapFirstAndLast =  p -> {
            int temp = p[0];
            p[0]= p[p.length-1];
            p[p.length-1] = temp;
            return p;
        };
        int[] nums = {1,2,3,4,5,6};
        System.out.println("swapFirstAndLast.apply(nums) = " + Arrays.toString( swapFirstAndLast.apply(nums)));

        System.out.println("----------------------------------");
        // Create a function that can reverse an array and returns it
        Function<int[], int[]> reverseArray = p -> {
            int[] reversed = new int[p.length];
            for (int i = reversed.length-1, j =0; i>=0; i--, j++) {
               reversed[j] = p[i];
           }
            return reversed;
       };
        int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("reverseArray.apply(arr4) = " + Arrays.toString(reverseArray.apply(arr4)));


        System.out.println("----------------------------------");
        // create a function that can reverse a List
        Function<List<Integer>, List<Integer>> reverseList = p -> {
            List<Integer> reversed1 = new ArrayList<Integer>(p.size());
            for (int i = p.size() - 1; i >= 0; i--) {
                reversed1.add(p.get(i));
            }

            return reversed1;
        };

        List<Integer> l3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        System.out.println("reverseList.apply(l3) = " + reverseList.apply(l3));


    }
}
