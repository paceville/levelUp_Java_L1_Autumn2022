package org.levelup.homework1.task1;

import java.util.Scanner;

public class MathOperationsClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to start calculator? Please write: 'Y' or 'N'");
        String inputString = input.nextLine();

        Calculator calculator = new Calculator();
        if (inputString.equals("Y") || inputString.equals("y")) {
            calculator.start();

            System.out.println("If you want to calculate integers, please write 'I', " +
                    "if you want to calculate doubles please write 'D'. Attention: doubles will be calculated by random numbers");
            inputString = input.nextLine();
            int mathOperation;

            if (inputString.equals("I") || inputString.equals("i")) {
                System.out.print("Enter first number: ");
                mathOperation = input.nextInt();
                calculator.setIntA(mathOperation);
                System.out.print("Enter second number: ");
                mathOperation = input.nextInt();
                calculator.setIntB(mathOperation);
            } else if (inputString.equals("D") || inputString.equals("d")) {
                calculator.setDoubleA(Math.random());
                calculator.setDoubleB(Math.random());
            } else {
                System.out.println("Something goes wrong...");
            }

            System.out.print("Enter the number of the mathematical operation: 0 - addition, 1 - substraction, 2 - multiplication or 3 - devision: ");
            mathOperation = input.nextInt();

            switch (mathOperation) {
                case 0:
                    if (inputString.equals("I") || inputString.equals("i")) {
                        System.out.println(calculator.getIntA() + " + " + calculator.getIntB()
                                + " = " + calculator.addition(calculator.getIntA(), calculator.getIntB()));
                    } else if (inputString.equals("D") || inputString.equals("d")) {
                        System.out.println(calculator.getDoubleA() + " + " + calculator.getDoubleB()
                                + " = " + calculator.addition(calculator.getDoubleA(), calculator.getDoubleB()));
                    }
                    break;
                case 1:
                    if (inputString.equals("I") || inputString.equals("i")) {
                        System.out.println(calculator.getIntA() + " - " + calculator.getIntB()
                                + " = " + calculator.substraction(calculator.getIntA(), calculator.getIntB()));
                    } else if (inputString.equals("D") || inputString.equals("d")) {
                        System.out.println(calculator.getDoubleA() + " - " + calculator.getDoubleB()
                                + " = " + calculator.substraction(calculator.getDoubleA(), calculator.getDoubleB()));
                    }
                    break;
                case 2:
                    if (inputString.equals("I") || inputString.equals("i")) {
                        System.out.println(calculator.getIntA() + " * " + calculator.getIntB()
                                + " = " + calculator.multiplication(calculator.getIntA(), calculator.getIntB()));
                    } else if (inputString.equals("D") || inputString.equals("d")) {
                        System.out.println(calculator.getDoubleA() + " * " + calculator.getDoubleB()
                                + " = " + calculator.multiplication(calculator.getDoubleA(), calculator.getDoubleB()));
                    }
                    break;
                case 3:
                    if (inputString.equals("I") || inputString.equals("i")) {
                        System.out.println(calculator.getIntA() + " / " + calculator.getIntB()
                                + " = " + calculator.devision(calculator.getIntA(), calculator.getIntB()));
                    } else if (inputString.equals("D") || inputString.equals("d")) {
                        System.out.println(calculator.getDoubleA() + " / " + calculator.getDoubleB()
                                + " = " + calculator.devision(calculator.getDoubleA(), calculator.getDoubleB()));
                    }
                    break;
                default:
                    System.out.println("Something goes wrong...");
            }

        } else if (inputString.equals("N") || inputString.equals("n")) {
            calculator.close();
        } else {
            System.out.println("Something goes wrong...");
        }
    }
}