package org.levelup.homework2;

public class Task6 {
    public static void main(String[] args) {

        int number = 997;
        String s = String.valueOf(number);
        while (s.length() <= 4) {
            number += 3;
            s = String.valueOf(number);

            if (s.length() > 4) {
                break;
            }

            System.out.print(number + " ");
        }
    }
}
