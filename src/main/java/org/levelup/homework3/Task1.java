package org.levelup.homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println("Source array: " + Arrays.toString(array));

        System.out.print("Inverted array: [ ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
