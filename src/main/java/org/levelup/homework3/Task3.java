package org.levelup.homework3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[8];

        int negativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21) - 10;

            if (array[i] < 0) {
                negativeNumbers ++;
            }
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Count of negative numbers: " + negativeNumbers);
    }
}
