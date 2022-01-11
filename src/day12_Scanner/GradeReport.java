package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scan.nextInt();
        String result = "";

        if(score>= 0 && score<= 100){
            result = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "F";

        }else{
            result = "Invalid score";
        }
        System.out.println(result);

        scan.close();





    }
}
