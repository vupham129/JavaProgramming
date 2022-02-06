package day44_Abstraction.animalTask;

public class Duck extends Animal implements Swimable, Flyable, Playable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
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
}
