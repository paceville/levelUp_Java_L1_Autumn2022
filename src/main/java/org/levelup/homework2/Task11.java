package org.levelup.homework2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any natural number: ");
        int number = input.nextInt();

        System.out.print("Positive devisors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
