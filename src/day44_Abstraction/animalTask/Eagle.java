package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements Wild, Flyable {
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
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
