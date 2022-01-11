package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = sc.next();
        System.out.println("Enter your password:");
        String p = sc.next();


        if(u.equals("Cydeo")&&p.equals("Cydeo123")){ // if credentials are valid
            System.out.println("Logged in");
        }else{
            int attempts = 3;
            while( !(u.equals("Cydeo")&&p.equals("Cydeo123")) && attempts>0){ // while the credentials are invalid
                if(attempts==1){
                    System.out.println("THIS IS YOUR LAST ATTEMPT");
                }
                System.err.println("Incorrect username of password, please re-enter");
                System.err.println("Enter your username:");
                u = sc.next();
                System.err.println("Enter your password:");
                p = sc.next();
                attempts--;
            }
            if(u.equals("Cydeo")&&p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }


        }
















    }


}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three
                attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is lucked."

 */