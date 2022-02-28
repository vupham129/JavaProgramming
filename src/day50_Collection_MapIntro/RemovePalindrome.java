package day50_Collection_MapIntro;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindrome {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String each = it.next();
            String reversed = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }

        System.out.println("names = " + names);//[Java, Python, Cydeo, Car]

        System.out.println("-----------------------------");

         List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));
        /*
        Predicate<String> palindrome = str -> {
            String reversed = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                reversed += str.charAt(i);
            }
            return reversed.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);
        System.out.println("names2 = " + names2);// [Java, Python, Cydeo, Car]

         */
        /*
        names2.removeIf(str -> { String reversed = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                reversed += str.charAt(i);
            }
            return reversed.equalsIgnoreCase(str);

        });

        System.out.println("names2 = " + names2);

         */




    }
}
/*
Tasks:
    1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions

    2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions

    3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
 */