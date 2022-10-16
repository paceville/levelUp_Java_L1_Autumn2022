package org.levelup.homework5.task4;

public class Cat extends Animal {
    Breed breed;
    boolean isHome;

    public Cat(String name, Breed breed, boolean isHome) {
        super.name = name;
        this.breed = breed;
        this.isHome = isHome;
    }
    enum Breed {
        BRITISH_SHORTHAIR,
        AMERICAN_SHORTHAIR,
        PERSIAN,
        MAINE_COON,
        SCOTTISH_FOLD,
        SPHYNX,
        ABYSSINIAN,
        DEVON_REX
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("'meow'");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + ": " + this.getFood());
    }
}
