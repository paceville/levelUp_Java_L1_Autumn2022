package org.levelup.homework5.task4;

public class Animal {
    String name, food, location;
    private Type animalType;

    enum Type {
        DOG,
        CAT,
        HORSE
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setAnimalType(Type animalType) {
        this.animalType = animalType;
    }

    public Type getAnimalType() {
        return this.animalType;
    }

    public void makeNoise() {
        System.out.print(this.getAnimalType() + " " + this.name + " says ");
    }

    public void eat() {
        System.out.print("Food for ");
    }

    public void sleep() {
        System.out.println(this.getAnimalType() + " " + this.name + " is sleeping");
    }
}
