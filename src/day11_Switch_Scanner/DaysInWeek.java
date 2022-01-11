package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;

        switch (number){ // 1,2,3,4,5,6,7 ==
            case 1:
                System.out.println("Monday");
                break; // exist the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; // exist the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;// exist the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;// exist the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;// exist the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;// exist the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;// exist the switch after executing the case block
            default: // only executed if none of the case blocks are matching
                System.out.println("Invalid Number");
                break; // dont need to have break
            // we don't need to give break stmt for the last block of the switch in order to exit the switch




        }













    }
}
