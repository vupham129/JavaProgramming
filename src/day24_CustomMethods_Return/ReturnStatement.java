package day24_CustomMethods_Return;

public class ReturnStatement {


    public static void main(String[] args) {





    }





    // 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid day";

        }
        /*
        if(number<1||number>7){
            System.out.println("Invalid");
            return; // to exit the method
        }

         */
    }

}
