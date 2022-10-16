package org.levelup.homework5.task4;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getAnimalType());
        animal.eat();
        System.out.println("Location: " + animal.getLocation());
    }
}
