package day47_Polymorphism_Collection;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Cube;
import day45_Abstraction.shapeTask.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);
        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal; // down casting
       // dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();

        System.out.println("-------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000);

        ((Tester)employee).bugReport();
       // ((Tester)employee).unitTest();
       // ((Developer)employee).unitTest();

      //  Driver driver = (Driver) employee; // down casting
        Person person = (Person) employee; // upcasting
      //  Teacher teacher = (Teacher) employee; // down casting

        System.out.println("-------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
       // s1.volume(); // 1. not every shape has volume, 2.

        //((Cube)s1).volume();



    }
}
