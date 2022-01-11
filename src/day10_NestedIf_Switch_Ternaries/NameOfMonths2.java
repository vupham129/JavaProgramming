package day10_NestedIf_Switch_Ternaries;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int number = 13;
        String result = (number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April"
                      :(number==5)? "May" :(number==6)? "June" :(number==7)? "July" :(number==8)? "August"
                      :(number==9)? "September" :(number==10)? "October" :(number==11)? "November" : "December";

        System.out.println("result = " + result);

        //nested if use ternaries

        String result1 = (number>=1 && number<=12)? (number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April"
                :(number==5)? "May" :(number==6)? "June" :(number==7)? "July" :(number==8)? "August"
                :(number==9)? "September" :(number==10)? "October" :(number==11)? "November" : "December" : "Invalid number";
        System.out.println(result1);







    }
}
