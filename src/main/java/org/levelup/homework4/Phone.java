package org.levelup.homework4;

import java.util.Arrays;

public class Phone {
    private String number;
    private double weight;
    private ModelTypes model;
    enum ModelTypes {
        IPHONE,
        ANDROID,
        WINDOWSPHONE,
        SYMBIAN
    }

    public String getNumber() {
        return this.number;
    }

    public double getWeight() {
        return this.weight;
    }

    public ModelTypes getModel() {
        return this.model;
    }

    Phone(String number, ModelTypes model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, ModelTypes model) {
        this(number, model, 0.0);
    }

    Phone() {}

    void printPhoneInfo() {
        System.out.println("Number: " + getNumber() + ", Model: " + getModel() +  ", weight " + getWeight());
    }

    private void receiveCall(String name) {
        System.out.println("Incoming call: " + name);
    }

    void receiveCall(String name, String number) {
        receiveCall(name);
        System.out.println("Telephone number: " + number);
    }

    void sendMessages(String[] numbers) {
        System.out.println("You " + getNumber() + " have sent a message to the following numbers: " + Arrays.toString(numbers));
    }
}
