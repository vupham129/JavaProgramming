package day09_IfAndElse;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 0;

        if(n > 0){ // n have to be greater than 0 --> positive
            System.out.println("Positive");
        }else if(n < 0){ // n have to be less than 0 --> negative
            System.out.println("Negative");
        }else{ // if n = 0, then n is zero
            System.out.println("Zero");
        }




    }
}
