package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds // 160 is out of byte's range (-128 to 127)
        short weight = 160;   // range of value (-32,768 to 32,767)

        // salary: 100000 $
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L; //force the compiler to take the number to long, by adding l or L at the end of the number

        // tax: 0.26
        float tax = 0.26f; //need to add f or F
        double PI = 3.14; // dont need to add d or D, it is preferred data types for all of decimal numbers

        // # can use char
        char ch1 = '#'; // variables data need to inside single quote
        System.out.println("ch1 = " + ch1);

        char ch2 = 35; // can use number on ascii table
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char yesNo = 'Y';
        System.out.println("gender = " + gender);
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 >300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String yourName = "Wooden Spoon";
        System.out.println("yourName = " + yourName);

        String city = "McLean";
        String state = "California";
        String country = "USA";

        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);
        String phoneNumber = "408_512_0136";
        System.out.println("phoneNumber = " + phoneNumber);

        String first_name$ = "Anna";

        int num1 = 100;
        int num2 = 200;

        double salaryAfterTax = 2.5; // one varibale name is for one variable data

        /*
        Rules for Variable names: - variables names should be readable
                                  - when variable names contain two or more words, use camel case
                                  - the first character must be one of the letters a-z or A-Z, and underscore (_), or a dollar sign ($)
                                  - after the first character, you may use letters a-z or A-Z, the digits, underscore (_), or a dollar sign($)
                                  - can not contain space
                                  - can not be Java reserved word
         */


    }
}
/*
variable naming rules:
1. MUST be unique
2. camel case
3. can not start with the digits
4. starts with lower case letters
5. can not be java reserved words
6. can not have special characters other than _ and $
7. name needs to be readable and meaningful, understandable
 */