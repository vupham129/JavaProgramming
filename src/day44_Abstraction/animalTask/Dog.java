package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable, Swimable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with owner");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming inside the pool");
    }
}
