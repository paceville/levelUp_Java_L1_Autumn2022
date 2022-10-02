package org.levelup.homework2;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(900) + 100;
        String s = String.valueOf(number);

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) > max) {
                max = Character.getNumericValue(s.charAt(i));
            }
        }

        System.out.println("The number is " + number + ". The largest number is " + max);
    }
}
