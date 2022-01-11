package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f+"."+l; // always have concatenation, on the left or on the right. can concated the empty string
        //String initial = "" +f+l;

        System.out.println("initial = " + initial);

        scan.close();

    }
}
/*
initial:
    firstName = "Wooden";
     lastName = "Spoon";

     output: W.S

     */