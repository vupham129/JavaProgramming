package day44_Abstraction.animalTask;

public class Java extends Animal implements Swimable, Flyable, Playable, Wild{
    public Java(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }
}
