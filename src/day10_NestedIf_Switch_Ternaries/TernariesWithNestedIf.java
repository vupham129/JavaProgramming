package day10_NestedIf_Switch_Ternaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 85;

        if(score>= 0 && score <= 100){
            if(score >= 60){ // if student passed the exam
                System.out.println("Passed");
            }else{ // if student failed the exam
                System.out.println("Failed");
            }
        }else{ // if the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("----------------");
        //Ternaries
        String result = (score>=0 && score<=100)? (score>=60)? "Passed" : "Failed" : "Invalid Score";
        //               nested if(condition){stmt /  if(condition){stmt/else{stmt} / }else{stmt}
        System.out.println("result = " + result);
    }
}
