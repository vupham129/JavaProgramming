package day10_NestedIf_Switch_Ternaries;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;

        if(score>= 0 && score <= 100){
            if(score >= 60){ // if student passed the exam
                System.out.println("Passed");
            }else{ // if student failed the exam
                System.out.println("Failed");
            }
        }else{ // if the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("----------------------------");

        int age = 19;
        boolean hasID = true;

        if(hasID){ // if the person has ID
            if(age >= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person's age is less than 21
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("---------------------------------------------");

        int number = 5;

        if(number >= 1 && number <= 7){ // if the number = 1 ~ 7
            // 7 possible output
            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number == 4){
                System.out.println("Thursday");
            }else if(number == 5){
                System.out.println("Friday");
            }else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{ // if the number is not valid
            System.out.println("Invalid Number");
        }

















    }
}
