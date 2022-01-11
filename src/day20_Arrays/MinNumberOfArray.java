package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0]; //10

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) { // if there is element that less than current min number
                min = numbers[i];// assgining the smallest element to variable min
            }

        }
        System.out.println("Minimum number is: " + min);







    }
}
