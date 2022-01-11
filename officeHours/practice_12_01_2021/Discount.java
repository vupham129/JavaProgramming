package practice_12_01_2021;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quantity");
        int quantity = input.nextInt();

        int totalCost = quantity*100;
        double discountRate = 0.1;
        double totalDiscountCost = totalCost*discountRate;

        if(totalCost>=1000){
            System.out.println("You get a discount of "+totalDiscountCost+" and your total will be "+(totalCost-totalDiscountCost));
        }else{
            System.out.println("No discount applied");
        }









    }
}
