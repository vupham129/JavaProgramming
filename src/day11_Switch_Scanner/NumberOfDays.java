package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 2;
        String result ="";

        if(number >= 1 && number <= 12){ // number : 1~12
            switch(number){
                case 2: // if apply the year , can use if condition inside the case blocks
                   /* if(year%4 ==0){
                        result = "29 days";
                    }else{
                        result = "28 days";
                    }

                    */
                    result = (year%4==0)? "29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
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
