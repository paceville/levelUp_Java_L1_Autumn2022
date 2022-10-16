package org.levelup.homework5.task4;

public class Horse extends Animal {

    Breed breed;
    boolean participatesInCompetitions;

    public Horse(String name, Breed breed, boolean participatesInCompetitions) {
        this.name = name;
        this.breed = breed;
        this.participatesInCompetitions = participatesInCompetitions;
    }

    enum Breed {
        THOROUGHBRED,
        AMERICAN_QUARTER,
        ARABIAN,
        CLYDESDALE,
        APPALOOSA,
        MORGAN,
        WARMBLOOD,
        ANDALUSIAN
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("'neigh'");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + ": oat");
    }
}
