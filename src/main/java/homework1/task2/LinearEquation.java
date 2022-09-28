package homework1.task2;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.println("Linear equation: " + a + "x" + " + " + b + " = 0");

        if (a != 0) {
            System.out.println("Result: " + (-b) / a);
        } else {
            if (b != 0) {
                System.out.println("The equation has no roots");
            } else {
                System.out.println("The root of the equation is any number");
            }
        }
    }
}
