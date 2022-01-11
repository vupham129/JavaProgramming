package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number%2 == 0;

        if(evenNumber){ // even number
            System.out.println(number+" is even number");
        }

        if(!evenNumber){ // not even number
            System.out.println(number+" is odd number");
        }

        System.out.println("--------------------------------------");
        int n = 200;

        // positive
        if(n>0){ // if number is greater than 0, then it is positive
            System.out.println(n+ " is positive");
        }
        // negative
        if(n<0){ // if n is lesser than zero, then it is negative
            System.out.println(n+ " is negative");
        }
        // zero

        if(n==0){ // if n is equal zero, then it is zero
            System.out.println(n+" is zero");
        }




    }
}
