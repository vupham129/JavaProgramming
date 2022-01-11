package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;


public class CapitalOne {
    public static void main(String[] args) {
        // 1. create 5 employee objects
        Employee employee1 = new Employee();
        employee1.setInfo("Jack", 12345, 'M', "Bank Teller", 45000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Nikki", 12346, 'F', "Banker", 95000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Jennifer", 12347, 'F', "Bank Teller", 25000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Jenny", 12348, 'F', "Banker", 105000, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Henry", 12349, 'M', "CEO", 450000, true);

        // 2. store those 5 employee objects into an array
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        //3. how many employees are fulltime employees?
        ArrayList<Employee> fullTime = new ArrayList<>(Arrays.asList(employees));
        fullTime.removeIf(p -> p.isFullTime == false);

        System.out.println("fullTime = " + fullTime);
        System.out.println("fullTime = " + fullTime.size());

        //4. what is the minimum and maximum salary?
        double minSalary = employees[0].salary;
        double maxSalary = employees[0].salary;

        for (Employee employee : employees) {
            if(employee.salary < minSalary){
                minSalary = employee.salary;
            }
            if(employee.salary > maxSalary){
                maxSalary = employee.salary;
            }
        }

        System.out.println("minimum Salary = $" + minSalary);

        System.out.println("maximum Salary = $" + maxSalary);














    }
}
