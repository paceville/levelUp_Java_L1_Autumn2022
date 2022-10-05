package org.levelup.homework3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println("Array is created: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        System.out.println("Array after all elements have been multiplied by a factor of 2: " + Arrays.toString(array));
    }
}
