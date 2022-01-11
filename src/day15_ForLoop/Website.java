package day15_ForLoop;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a website");
        String website = scan.next().toLowerCase();

        scan.close();

        boolean isValid = website.startsWith("www.") && website.endsWith(".com")||  website.endsWith(".edu")|| website.endsWith(".gov");

        if(isValid){
            System.out.println("Website is valid");
        }



    }
}
/*
 2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */