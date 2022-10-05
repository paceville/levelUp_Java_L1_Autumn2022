package org.levelup.homework3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(31) - 20;
        }

        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println("Array after transformation: negative numbers -> 0: " + Arrays.toString(array));
    }
}
