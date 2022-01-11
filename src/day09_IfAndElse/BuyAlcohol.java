package day09_IfAndElse;

public class BuyAlcohol {
    public static void main(String[] args) {
         String name = "Amanda";
         int age = 21;
         char driverLicense = 'N';

         boolean isEligibleToBuyAlcohol = age >= 21 && driverLicense == 'Y';

         if(isEligibleToBuyAlcohol){
             System.out.println(name + " is eligible to buy alcohol");
         }else{
             System.out.println("Sorry, " + name + " is not eligible to buy alcohol");
         }




    }
}
