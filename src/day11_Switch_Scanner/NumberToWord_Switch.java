package day11_Switch_Scanner;

public class NumberToWord_Switch {
    public static void main(String[] args) {
        int number = 13;
        String result ="";
        switch(number){
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result ="Invalid";
                break;

        }
        System.out.println("result = " + result);






    }
}
