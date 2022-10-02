package org.levelup.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber = 0, secondNumber = 0, firstComparisonDifference = 0, difference = 0;

        int count = 1;
        while (count <= 2) {
            System.out.print("Enter " + count + " positive number: ");
            double inputNumber = input.nextDouble();

            if (inputNumber <= 10) {
                difference = 10 - inputNumber;
            } else {
                difference = inputNumber - 10;
            }

            if (count == 1) {
                firstNumber = inputNumber;
                firstComparisonDifference = difference;
            } else {
                secondNumber = inputNumber;
            }
            count++;
        }

        if (firstComparisonDifference < difference) {
            System.out.println("Closest number to 10 is " + firstNumber);
        } else {
            System.out.println("Closest number to 10 is " + secondNumber);
        }
    }
}