package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = input.nextLine(); // Wooden Spoon enter

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine(); // java programming languageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt();//24

        input.nextLine();// capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("name = " + name);

        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

































        input.close();











    }
}
