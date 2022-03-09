package day53_FunctionalInterface.day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("--------------------------");

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("--------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList()); // skip 5 first elements
        System.out.println("list2 = " + list2); //[6, 7, 8, 9, 10]
        System.out.println("--------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        //skip first 4 elements
        arr2 = Arrays.stream(arr2).skip(4).toArray();
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("--------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println("list3 = " + list3);//[4, 5, 6, 7]
        System.out.println("--------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // map accept Function functional interface, lambda expression
        list4 = list4.stream().map(p-> p*10).collect(Collectors.toList());

        System.out.println("list4 = " + list4); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        System.out.println("----------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map( p -> p.substring(0, 3)).collect(Collectors.toList());

        System.out.println("days = " + days); // [Mon, Tue, Wed, Thu, Fri, Sat, Sun]
        System.out.println("----------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println("evens = " + evens);//[2, 4, 6, 8, 10]
        System.out.println("----------------------");

        List<String> list6 = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        int countJava = (int) list6.stream().filter(p -> p.equalsIgnoreCase("java")).count();
        System.out.println("countJava = " + countJava); //3
        System.out.println("----------------------");

        list6.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));

        System.out.println("----------------------");

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1 = list7.stream().allMatch(p-> p%2==0); // if all elements are even

        System.out.println("r1 = " + r1);//false

        boolean r2 = list7.stream().anyMatch(p->p>20); // if any element is greater than 20
        System.out.println("r2 = " + r2);//false

       // boolean r3 = list7.stream().noneMatch(p -> p%2==0);
        boolean r3 = list7.stream().noneMatch(p-> p%3==0); // if all elements are divisible by 3 -> return false
        System.out.println("r3 = " + r3);//false






    }
}
