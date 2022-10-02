package org.levelup.homework2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] array = {3, 0, -6};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        boolean isSorted = false;
        int j;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    j = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = j;
                    isSorted = false;
                }
            }
        }

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
