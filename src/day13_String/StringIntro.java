package day13_String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
        //name: store in Stack // Wooden Spoon: store in Java Heap
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";
        // only one object Wooden Spoon inside the Heap, will be stored in the String Pool, and it does not take duplicate
        System.out.println(name  == name2);//true
        System.out.println(name2 == name3);// true
        System.out.println(name3 == name4);// true

        //Scanner scan = new Scanner(System.in);
        // scan: store in Stack // new Scanner(System.in): store in Heap
        //scan.close();

        System.out.println("----------------------------");


        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1==str2);// false
        System.out.println(str2==str3);//false

        System.out.println("----------------------------------------");
        String s1 = "Java";
        String s2= new String("Java");
        System.out.println(s1.equals(s2));// true

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));// false



    }
}
