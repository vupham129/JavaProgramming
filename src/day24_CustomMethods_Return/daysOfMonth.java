package day24_CustomMethods_Return;

public class daysOfMonth {
    //5. Create a method that can print how many days a month has


    public static void main(String[] args) {

        daysOfMonth(5);// 31 days


    }

    public static void daysOfMonth(int number){

        String result ="";

        if(number >= 1 && number <= 12){ // number : 1~12
            switch(number){
                case 2: result = "28 days"; break;

                case 4: case 6: case 9: case 11:// month: 4,6,9,11
                    result = "30 days";
                    break;
                default: // number: 1,3,5,7,8,10,12
                    result = "31 days";
                    break;
            }
        }else{
            result = "Invalid number";
        }

        System.out.println(result);



    }





}
