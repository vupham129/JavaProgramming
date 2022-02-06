package day44_Abstraction.animalTask;

public class Shark extends Animal implements Wild, Swimable{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }
}
