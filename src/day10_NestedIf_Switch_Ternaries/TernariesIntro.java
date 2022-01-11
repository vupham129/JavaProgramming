package day10_NestedIf_Switch_Ternaries;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2 == 0){
            System.out.println("Even"); // String
        }else{
            System.out.println("Odd"); // String
        }

        System.out.println("---------------------------");

       String result1  = (n%2==0)? "Even" : "Odd";

        System.out.println("result1 = " + result1);

        System.out.println("----------------------------");

        int age = 23;
        /*
        if(age >= 21){
            System.out.println("Eligible"); // String
        }else{
            System.out.println("Not Eligible"); // String
        }
        */

        String result2 = (age >= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        // System.out.println((age >= 21)? "Eligible" : "Not Eligible"); // another way to print

        System.out.println("--------------------------------");

        int number = 100;
        /*
        if(number>0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        */

        // ternaries:

        // System.out.println((number>0)? "Postive" :(number<0)? "Negative" : "Zero");

        // or assign a variable
        String result3 = (number>0)? "Postive" :(number<0)? "Negative" : "Zero";
        //                if(condition) stmt  / else if(condition) stmt/  else stmt
        System.out.println(result3);















    }
}
