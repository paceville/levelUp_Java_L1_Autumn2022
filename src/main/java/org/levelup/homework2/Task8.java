package org.levelup.homework2;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int number = 95;

        while (number > 0) {
            list.add(number -= 5);
            System.out.print(number + " ");
        }

        System.out.println("\nCount of numbers: " + list.size());
    }
}
