package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourlyRate, weeklyHours -> calculate the salary

        int hourly_Rate = 50;
        int weeklyHours = 40;

        int salary = hourly_Rate * weeklyHours * 52;

        System.out.println(salary); // no inside the "", because it only print the letter salary
        
        // short cut to print any varibale 'soutv'
        System.out.println("salary = $" + salary); // can add $ inside the double quote
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourly_Rate = $" + hourly_Rate);


    }




}
