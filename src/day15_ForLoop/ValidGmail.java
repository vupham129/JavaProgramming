package day15_ForLoop;

import java.util.Scanner;

public class ValidGmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email:");
        String email = scan.next().toLowerCase();

        String result = "";

        scan.close();
        if(email.contains("@gmail.com")){
            result = "Valid";
        }else{
           result = "Invalid";
        }
        System.out.println(result);


    }
}
/*
1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
 */
