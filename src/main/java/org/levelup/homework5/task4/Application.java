package org.levelup.homework5.task4;

public class Application {
    public static void main(String[] args) {
        Dog dogCooper = new Dog("Cooper", Dog.Breed.GOLDEN_RETRIEVER, true);
        dogCooper.setAnimalType(Animal.Type.DOG);
        dogCooper.setFood("meat");
        dogCooper.setLocation("New York");
        dogCooper.makeNoise();
        dogCooper.sleep();

        Cat catManu = new Cat("Manu", Cat.Breed.AMERICAN_SHORTHAIR, true);
        catManu.setAnimalType(Animal.Type.CAT);
        catManu.setFood("chicken");
        catManu.setLocation("St. Petersburg");
        catManu.makeNoise();
        catManu.sleep();

        Horse horseDucat = new Horse("Ducat", Horse.Breed.ANDALUSIAN, true);
        horseDucat.setAnimalType(Animal.Type.HORSE);
        horseDucat.setFood("oat");
        horseDucat.setLocation("Moscow");
        horseDucat.makeNoise();
        horseDucat.sleep();

        Animal[] animals = {dogCooper, catManu, horseDucat};

        Veterinarian vet = new Veterinarian();

        System.out.println("\nPatient cards:\n");
        for (Animal item : animals) {
            vet.treatAnimal(item);
            System.out.println("----------\n");
        }
    }
}
