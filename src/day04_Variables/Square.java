package day04_Variables;

public class Square {
    public static void main(String[] args) {
        // area = side * side, perimeter = 4* side

        double sideOfSquare = 2.3; // double is preferred data type in java for decimal numbers

        double areaOfSquare = sideOfSquare * sideOfSquare;
        double perimeterOfSquare = 4 * sideOfSquare;

        System.out.println("sideOfSquare = " + sideOfSquare);
        System.out.println("areaOfSquare = " + areaOfSquare);
        System.out.println("perimeterOfSquare = " + perimeterOfSquare);
    }
}
/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side

                        area = side * side;
                        perimeter = 4 * side
 */