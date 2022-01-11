package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = sc.next();
        System.out.println("Enter your password:");
        String p = sc.next();


        if(u.equals("Cydeo")&&p.equals("Cydeo123")){ // if credentials are valid
            System.out.println("Logged in");
        }else{
            for(int i = 1; i<=3; i++){ // attempts : 1,2,3
                System.err.println("Incorrect username and password, please re-enter");
                System.err.println("Enter your username:");
                u = sc.next();
                System.err.println("Enter your password:");
                p = sc.next();
                if(u.equals("Cydeo")&&p.equals("Cydeo123") && (i>=1 && i<=3)){
                    System.out.println("Logged in");
                    break; // exits the loop if the username and password correct and attempt = 3
                }
                if(i == 3){ // if incorrect for three time, then account is locked
                    System.out.println("Your account is locked");
                }




            }










        }



















    }
}
