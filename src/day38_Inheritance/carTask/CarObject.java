package day38_Inheritance.carTask;

public class CarObject {
    public static void main(String[] args) {

    Toyota car1 = new Toyota("Camry", 2020, 25300, "Black", 9000);
    car1.start();
    car1.drive();
    car1.reliable();

    BMW car2 = new BMW("M340i Sedan", 2022, 73000, "Orange", 2000);
    car2.start();
    car2.drive();
    car2.racing();
    car2.breaksDown();

    Tesla car3 = new Tesla("Model S", 2021, 56000, "Navy Blue", 15000);
    car3.start();
    car3.drive();
    car3.autoPilot();







    }
}
