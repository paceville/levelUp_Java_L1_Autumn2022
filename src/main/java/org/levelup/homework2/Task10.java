package org.levelup.homework2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any natural number: ");
        long number = input.nextLong();
        long factorial = 1;

        if (number > 0) {
            for (long i = 0; i < number; i++) {
                factorial *= (number - i);
            }
        }

        System.out.println(number + "! = " + factorial);
    }
}
