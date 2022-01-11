package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable thats is capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        //System.out.println(myGroup);// hash code
        System.out.println(Arrays.toString(myGroup));// ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("----------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index number:  0          1           2             3          4          5          6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println( days[number-1]);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));
        int number1 = 11;

        if(number1 <0 || number>11){
            System.err.println("Invalid");
            System.exit(0);
        }

        System.out.println(months[number1-1]);





    }
}
