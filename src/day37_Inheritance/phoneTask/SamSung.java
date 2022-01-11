package day37_Inheritance.phoneTask;

public class SamSung extends Phone{


    public SamSung( String model, String size, double price, String color) {
        super("SamSung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */