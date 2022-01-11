package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        double length = 2.5; // double is preferred data type in java
        double width = 3.2;

        double areaOfRectangle = length * width;
        double perimeterOfRectangle = 2 + (length*width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("areaOfRectangle = " + areaOfRectangle);
        System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);

    }
}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */