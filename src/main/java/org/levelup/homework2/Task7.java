package org.levelup.homework2;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int number = -1;

        for (int i = 0; i < 55; i++) {
            list.add(number += 2);
            System.out.print(number + " ");
        }

        System.out.println("\nCount of numbers: " + list.size());
    }
}
