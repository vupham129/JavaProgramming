package day15_ForLoop;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = scan.next();
        System.out.println("Enter last name");
        String last = scan.next();

        scan.close();

        String firstName = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        //                   C                               + ydeo
        // firstName = (""+ first.charAt(0) ).toUpperCase() + first.substring(1).toLowercase;
        String lastName = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = firstName + " "+lastName;
        System.out.println(fullName);

    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */