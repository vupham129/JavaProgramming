package day24_CustomMethods_Return;

public class NameOfMonth {
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void main(String[] args) {

        nameOfMonth(5);// May

    }



    public static void nameOfMonth(int number){
        String result = "";
        switch(number){
            case 1: result = "January"; break;
            case 2: result = "February"; break;
            case 3: result = "March"; break;
            case 4: result = "April"; break;
            case 5: result = "May"; break;
            case 6: result = "June"; break;
            case 7: result = "July"; break;
            case 8: result = "August"; break;
            case 9: result = "September"; break;
            case 10: result = "October"; break;
            case 11: result = "November"; break;
            case 12: result = "December"; break;
            default: result = "Invalid month";

        }
        System.out.println(result);








    }


}
