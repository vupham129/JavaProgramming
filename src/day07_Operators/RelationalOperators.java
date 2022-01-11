package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false
        System.out.println("result4 = " + result4);

        // credit score of 720

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater, then it's eligible for the loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);// true

        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);// true

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);

        System.out.println("---------------------------");

        int x = 100;
        int y = 200;
        boolean isxEqualy = x ==y;
        System.out.println("isxEqualy = " + isxEqualy);// false

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);//flase

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);// false

        boolean result10= "Java" == "Java";
        System.out.println("result10 = " + result10);// true

        System.out.println("------------------------------");

        // not equal !=

        boolean result11 = 100 != 200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; // true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);






    }

}
