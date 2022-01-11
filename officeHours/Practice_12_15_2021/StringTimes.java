package Practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {
    /*
      Given a string and a non-negative int n, return a larger string that is n copies of the original string.
             input String : Hi  ,  input int : 2
             output: HiHi
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any word");
        String word = input.nextLine();
        System.out.println("enter any positive number");
        int num = input.nextInt();

        //int count = 0;
        String sum = "";
/*
        while(count<num){
            sum += word;
            count++;
        }
        System.out.println(sum);

 */

        for( int i =0; i<num; i++){
            sum += word;
        }

        System.out.println(sum);





    }


}
