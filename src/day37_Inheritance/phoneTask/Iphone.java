package day37_Inheritance.phoneTask;

public class Iphone extends Phone { // parent class: only contains the common features of all the subclass


    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a facetime with phone number: "+phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand+" "+model+" is having a facetime with email: "+email);
    }


}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */