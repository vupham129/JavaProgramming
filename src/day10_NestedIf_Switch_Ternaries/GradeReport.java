package day10_NestedIf_Switch_Ternaries;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90 ~ 100: excellent
        80 ~ 89: great
        70 ~ 79: good
        60 ~ 69: passed
        0 ~ 59: failed
         */
        /* int grade = 95;
        if(grade >= 0 && grade <= 100){ // if the score is valid
            // 5 possible outputs
            if(grade >= 90){ // it already checked in pre-condition // false: grade < 90
                System.out.println("Excellent");
            }else if(grade >= 80) {// false: grade < 80
                System.out.println("Great");
            }else if(grade >= 70) { // false: grade < 70
                System.out.println("Good");
            }else if(grade >= 60) { // false: grade < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is not valid
            System.out.println("Invalid grade");
        }

        System.out.println("--------------------------------");

        String result = ""; // temporary

        if(grade >= 0 && grade <= 100){ // if the score is valid
            // 5 possible outputs
            if(grade >= 90){ // it already checked in pre-condition // false: grade < 90
                result = "Excellent";
            }else if(grade >= 80) {// false: grade < 80
                result = "Great";
            }else if(grade >= 70) { // false: grade < 70
                result = "Good";
            }else if(grade >= 60) { // false: grade < 60
               result = "Passed";
            }else{
               result = "Failed";
            }

        }else{ // if the score is not valid
            System.out.println("Invalid grade");
        }

        System.out.println("result = " + result);
         */

        int grade1 = 105;
        String result = (grade1>=0 && grade1<=100)?
                            (grade1>=90)? "Excellent" :(grade1>=80)? "Great"
                                    :(grade1>=70)? "Good" :(grade1>=60)? "Passed" : "Failed"
                        : "Invalid grade";

        System.out.println("result = " + result);

        System.out.println("----------------------");
        String result1 ="";
        if(grade1>=0 && grade1<=100){
            result1 = (grade1>=90)? "Excellent" :(grade1>=80)? "Great"
                    :(grade1>=70)? "Good" :(grade1>=60)? "Passed" : "Failed";
        }else{
            result1 = "Invalid grade";
        }
        System.out.println(result1);
















    }
}
