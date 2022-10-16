package org.levelup.homework5.task4;

public class Dog extends Animal {
    private Breed breed;
    private boolean isHunter;

    public Dog (String name, Breed breed, boolean isHunter) {
        this.name = name;
        this.breed = breed;
        this.isHunter = isHunter;
    }

    enum Breed {
        GOLDEN_RETRIEVER,
        LABRADOR_RETRIEVER,
        FRENCH_BULLDOG,
        GREAT_DANE,
        BEAGLE,
        GERMAN_SHEPHERD,
        POODLE
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("'woof'");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + ": meat");
    }
}
