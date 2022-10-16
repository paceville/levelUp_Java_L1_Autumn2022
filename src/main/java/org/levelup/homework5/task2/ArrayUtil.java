package org.levelup.homework5.task2;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array: " + Arrays.toString(array)
        + "\nMin value: " + findMin(array)
        + "\nMax value: " + findMax(array));
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}