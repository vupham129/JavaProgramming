package day37_Inheritance.phoneTask;

public class Phone {
    public String brand, model, size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    } // no inherit--> constructor

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }


}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add constructor to set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
