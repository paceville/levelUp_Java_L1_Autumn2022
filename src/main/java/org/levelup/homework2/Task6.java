package org.levelup.homework2;

public class Task6 {
    public static void main(String[] args) {

        int number = 997;

        while (true) {
            number += 3;

            if (number / 10000 == 1) {
                break;
            }

            System.out.print(number + " ");
        }
    }
}
