package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'A';
        String grade ="";
        switch(ch){ // only == and ||
            case 'A': case 'B': case 'C': case 'D': // can declare back to back, this is only way to use "or" logical operator
                grade = "Passed";
                break;
            case 'F':
                grade = "Failed";
                break;
            default:
                grade ="Invalid";


        }

        System.out.println(grade);
    }
}
/*
if the grade is A or B or C or D ==> "Passed"
otherwise ==> "Failed
 */