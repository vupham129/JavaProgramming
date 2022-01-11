package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine(); // add this line if the nextLine method use after other methods

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zipcode");
        String zipCode = input.next();

        input.nextLine(); // add this line if the nextLine method use after other methods

        System.out.println("Enter your country name");
        String countryName = input.nextLine();


        System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+cityName+", "+state +" "+zipCode+" "+countryName);


        input.close();
    }
}
/*
1. Enter your full name (nextLine())
2. Enter your building number (next())
3. Enter your street name (nextLine())
4. Enter your city name (nextLine())
5. Enter your state (CA, VA only...) (next())
6. Enter your zipcode (nextInt())

display the shipping address
 */