package day44_Abstraction.animalTask;

public class Dolphin extends Animal implements Swimable,Playable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is safe for playing with human");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" knows how to swim");
    }
}
