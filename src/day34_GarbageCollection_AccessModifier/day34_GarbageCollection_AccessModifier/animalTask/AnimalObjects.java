package day34_GarbageCollection_AccessModifier.day34_GarbageCollection_AccessModifier.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "Small", "White");

        dog1.bark();
        System.out.println(dog1);

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "large", "Black");

        cat1.scratch();
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King", "macaw", 'M', 3, "Small", "Blue");

        System.out.println(parrot1);


    }
}
