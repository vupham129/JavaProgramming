package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Ann Beiner";
        String buildingNumber = "5689B";
        String streetName = "McLaughlin Ave";
        String city = "San Jose";
        String state = "CA";
        String zipCode = "95121";
        System.out.println(name + "\n" + buildingNumber + " "
                + streetName + "\n" + city + ", " + state + ", " + zipCode);
        System.out.println("--------------------------------------------------------------------------");

// another way to do

        String name1 = "James King",
                buildingNumber1 = "123B",
                streetName1 = "Jones Branch Dr",
                city1 = "McLean",
                state1 = "VA",
                zipCode1 = "22031A";
        System.out.println(name1 + "\n" + streetName1 + "\n" + city1 + ", " + state1 + ", " + zipCode1);

        String address = name1 + "\n" + streetName1 + "\n" + city1 + ", " + state1 + ", " + zipCode1;

        System.out.println(address);

        System.out.println("I will learn " + "\"" + name1 + "\"" + " and " + "\"" + streetName1 + "\"" + " at CybertekSchool.");


    }
}


/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */