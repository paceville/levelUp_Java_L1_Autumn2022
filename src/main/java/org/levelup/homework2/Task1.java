package org.levelup.homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Please write any integer: ");
        Scanner inputNumber = new Scanner(System.in);

        if (inputNumber.nextInt() % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
