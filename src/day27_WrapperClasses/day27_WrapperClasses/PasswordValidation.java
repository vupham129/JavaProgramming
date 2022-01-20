package day27_WrapperClasses.day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scan.nextLine();

      int upperCase =0;
      int lowerCase = 0;
      int specialChar =0;
      int digits = 0;
      int space = 0;

        for (int i = 0; i < password.length(); i++) {
            char eachCh = password.charAt(i);
            if(Character.isUpperCase(eachCh)){
                upperCase++;
            }
            if(Character.isLowerCase(eachCh)){
                lowerCase++;
            }
            if( !Character.isLetterOrDigit(eachCh) ){
                specialChar++;
            }
            if(Character.isDigit(eachCh)){
                digits++;
            }
            if(Character.isSpaceChar(eachCh)){
                space++;
            }
        }

        if(digits>=1 && specialChar >=1&&lowerCase>=1&&upperCase>=1 && password.length()>=8 && space==0){
            System.out.println("Your password is strong");
        }else{
            System.out.println("Your password is weak");
        }






    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */