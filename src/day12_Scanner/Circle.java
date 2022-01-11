package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scan.nextDouble();

        double area = radius*radius*3.14;
        double perimeter = 2*radius*3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close(); // last time not use scanner method




    }
}
/*
area, perimeter
 PI = 3.14
area = radius * radius * PI
 Perimeter = 2 * radius * PI
 */