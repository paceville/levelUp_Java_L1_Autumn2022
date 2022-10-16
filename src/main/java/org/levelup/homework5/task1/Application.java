package org.levelup.homework5.task1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to start calculator? Please enter 'Y' or 'N'");
        boolean startCalculator = false;

        if (input.nextLine().equals("Y")) {
            startCalculator = true;
            calculator.start();
        } else {
            calculator.close();
        }

        while (startCalculator) {
            startCalculator = false;

            System.out.println("Please select the operation: 0 - addition, 1 - substraction, 2 - multiplication, 3 - devision");
            int operation = input.nextInt();
            System.out.print("You selected ");
            if (operation == 0) {
                System.out.println("addition");
            } else if (operation == 1) {
                System.out.println("substraction");
            } else if (operation == 2) {
                System.out.println("multiplication");
            } else if (operation == 3) {
                System.out.println("devision");
            } else {
                System.out.println("Something goes wrong...");
            }

            System.out.println("Please select number type: '0' - integer, '1' - double, '2' - long");
            int numberType = input.nextInt();

            var firstNumber = 0.0;
            var secondNumber = 0.0;

            System.out.print("You selected ");
            if (numberType == 0) {
                System.out.print("integer. \nPlease enter first number: ");
                firstNumber = input.nextInt();
                System.out.print("Please enter second number: ");
                secondNumber = input.nextInt();
            } else if (numberType == 1) {
                System.out.print("double. \nPlease enter first number: ");
                firstNumber = input.nextDouble();
                System.out.print("Please enter second number: ");
                secondNumber = input.nextDouble();
            } else if (numberType == 2) {
                System.out.print("long. \nPlease enter first number: ");
                firstNumber = input.nextLong();
                System.out.print("Please enter second number: ");
                secondNumber = input.nextLong();
            } else {
                System.out.println("Something goes wrong...");
            }

            switch (operation) {
                case 0:
                    System.out.println(firstNumber
                            + " + "
                            + secondNumber
                            + " = "
                            + calculator.addition(firstNumber, secondNumber));
                    break;

                case 1:
                    System.out.println(firstNumber
                            + " - "
                            + secondNumber
                            + " = "
                            + calculator.substraction(firstNumber, secondNumber));
                    break;

                case 2:
                    System.out.println(firstNumber
                            + " * "
                            + secondNumber
                            + " = "
                            + calculator.multiplication(firstNumber, secondNumber));
                    break;

                case 3:
                    System.out.println(firstNumber
                            + " / "
                            + secondNumber
                            + " = "
                            + calculator.devision(firstNumber, secondNumber));
                    break;

                default:
                    System.out.println("Something goes wrong...");
            }

            System.out.print("Do you want to calculate something else? Please enter 'Y' or 'N'");

            if (input.nextLine().equals('Y')) {
                startCalculator = true;
            }
        }
    }


}
