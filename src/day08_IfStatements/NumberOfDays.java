package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        String numberOfMonths = "1, 3, 5, 7, 8, 10, 12",
                numberOfMonths1 = "4, 6, 9, 11",
                numberOfMonths2 = "2";
        int numberOfDays = 30;

        if(numberOfDays == 31){
            System.out.println("Months have 31 days: " + numberOfMonths);
        }
        if(numberOfDays == 30){
            System.out.println("Months have 30 days: " + numberOfMonths1);
        }
        if(numberOfDays == 28){
            System.out.println("Months have 28 days: " + numberOfMonths2);
        }

        System.out.println("------------------------------------------------");

        int number = 4;
        boolean has28Days = number == 2; // for the months that has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        // for the months that has 30 days
        boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;
        // for the months that has 31 days, or can use boolean = !has28Days && !has30Days

        if(has28Days){
            System.out.println("28 Days");
        }
        if(has30Days){
            System.out.println(" 30 Days");
        }
        if(has31Days){
            System.out.println("31 Days");
        }


    }

}
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */