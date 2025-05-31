package org.abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // can't have the code below because Animal is an abstract class
        // would you ever want an instance of an animal??
        // don't you want a dog? cat? Something more specific??
        // Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "small", 100);
        dog.makeNoise();
        doAnimalStuff(dog) ;
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Horse("Clydesdale", "large", 1000));
        for (Animal animal: animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
