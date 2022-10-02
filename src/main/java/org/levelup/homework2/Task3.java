package org.levelup.homework2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(151) + 5;

        if ((secretNumber >= 25) && (secretNumber <= 100)) {
            System.out.println("The number " + secretNumber + " is in the range [25;100]");
        } else {
            System.out.println("The number " + secretNumber + " is not in the range [25;100]");
        }
    }
}
