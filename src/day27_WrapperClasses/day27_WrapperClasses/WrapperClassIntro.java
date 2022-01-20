package day27_WrapperClasses.day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num1 = 200;
        Integer n1 = num1; // auto boxing

        int num2 = n1; // unboxing

        System.out.println("-----------------------");

        Integer integerValue = 100;

        long longValue = integerValue; // Primitives accept any Class value within the range

        System.out.println("-----------------------");

        int num3 = 200;
        // each primitive can only convert to its own class such as int-->Integer etc




    }
}
