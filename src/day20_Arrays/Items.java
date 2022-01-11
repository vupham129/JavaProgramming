package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        /*
        5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
         */

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];
        double totalPrice = 0;
        String[] reportShoppingList = new String[5];

        for (int i = 0; i < 5; i++) {// i: index number of items and prices
            System.out.println("Enter an item:");
            items[i] = scan.next();
            System.out.println("Enter price of this item:");
            prices[i]= scan.nextDouble();

            totalPrice = totalPrice+prices[i];

            reportShoppingList[i] = "Item: " + items[i] +" Price: "+prices[i];
        }
        //System.out.println(Arrays.toString(reportShoppingList));

        for (int j = 0; j < reportShoppingList.length; j++) {
            System.out.println(reportShoppingList[j]);
        }
        System.out.println("Total price: "+totalPrice);

        scan.close();








    }
}
