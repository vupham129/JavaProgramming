package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Flyable, Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" has wings to fly");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playable for human");
    }
}
