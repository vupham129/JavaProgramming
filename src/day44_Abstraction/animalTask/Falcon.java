package day44_Abstraction.animalTask;

public class Falcon extends Animal implements Wild, Flyable{
    public Falcon(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snakes");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is a fly animal");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting snakes");
    }
}
