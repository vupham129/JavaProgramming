package day12_Scanner;

import java.util.Scanner; // *: wild import --> imports everything from util package

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result = "";
        if(num>=1 && num <=7){
            // 7 possible outputs
           /* switch(num){ // can use ternary
                case 1:
                    result = "Monday"; break;
                case 2:
                    result = "Tuesday"; break;
                case 3:
                    result = "Wednesday"; break;
                case 4:
                    result = "Thursday"; break;
                case 5:
                    result = "Friday"; break;
                case 6:
                    result = "Saturday"; break;
                default:
                    result = "Sunday";

            }

            */
            result = (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday"
                    :(num==5)? "Friday" :(num==6)? "Saturday" : "Sunday";
        }else{
            result = "Invalid Number";
        }
        System.out.println(result);

        scan.close(); // close once you are done with scanner. have to create a new object if want to use another


    }

}
