package day09_IfAndElse;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 17;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        if(isEligible){
            System.out.println("Congrats, " + name + " is eligible to vote");
        }else{
            System.out.println("I am sorry, " + name + " is not eligible to vote ");
        }




    }
}
