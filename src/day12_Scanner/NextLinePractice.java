package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt(); // it is not capture the Enter key for entering the fullname

        input.nextLine();//Enter

        System.out.println("Enter your full name:");
        String name = input.nextLine();

        System.out.println("Enter your GPA:");
        double GPA = input.nextDouble();// 3.5

        input.nextLine();//Enter

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);
























        input.close();

    }
}
/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */