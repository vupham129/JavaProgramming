package day43_Abstraction.carTask;

public class CarShop {
    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo", "Batch25", "Blue", 2022, 100000);
        // -> we can not create object from abstract class, because abstract class can not concrete

        Honda honda = new Honda("Accord", "Burgundy", 2014, 18200);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);






    }
}
