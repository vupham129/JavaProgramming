package day35_Encapsulation;

public class Person {
    public String name;
    public char gender;
    public int age;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, char gender, int age, String language) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.language = language;
    }

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */