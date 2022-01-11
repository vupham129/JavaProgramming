package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int hour = scan.nextInt();

        System.out.println("Enter your state tax (in percentage):");
        double stateTaxRate = scan.nextDouble();

        System.out.println("Enter your federal tax (in percentage):");
        double federalTaxRate = scan.nextDouble();

        double salary = hour * hourlyRate,
                stateTax = salary * (stateTaxRate / 100),
                federalTax = salary * (federalTaxRate / 100),
                totalTax = stateTax + federalTax,
                netIncome = salary - totalTax;

        System.out.println("salary: " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        scan.close();




    }
}


































































