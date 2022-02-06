package day44_Abstraction.animalTask;

public class Lion extends Animal implements Wild{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is a wild animal and hunting deers");
    }
}
