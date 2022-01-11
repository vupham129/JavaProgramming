package day24_CustomMethods_Return;

public class Initials {
    //1. Create a method that can display the initials of the person
    public static void main(String[] args) {

        initials("Vu", "Pham");// V.P

    }



    public static void initials(String firstName, String lastName){

       String firstLetterOfFN = firstName.substring(0,1);
        String firstLetterOfLN = lastName.substring(0,1);

        String initials = firstLetterOfFN+"."+firstLetterOfLN;
        initials = initials.toUpperCase();

        System.out.println(initials);



    }





}
