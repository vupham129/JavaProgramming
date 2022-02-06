package day44_Abstraction.animalTask;

public class Cow extends Animal implements Playable{
    public Cow(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating grass");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is a playable cow");
    }
}
