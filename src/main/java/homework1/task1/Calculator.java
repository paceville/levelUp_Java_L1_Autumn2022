package homework1.task1;

public class Calculator {
    public int intA, intB;
    public double doubleA;

    public double doubleB;

    public int getIntA() {
        return intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public int getIntB() {
        return intB;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }

    public double getDoubleA() {
        return doubleA;
    }

    public void setDoubleA(double doubleA) {
        this.doubleA = doubleA;
    }

    public double getDoubleB() {
        return doubleB;
    }

    public void setDoubleB(double doubleB) {
        this.doubleB = doubleB;
    }

    public void start() {
        System.out.println("Calculator started");
    }

    public void close() {
        System.out.println("Calculator closed");
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public double substraction(double a, double b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public int devision(int a, int b) {
        return a / b;
    }

    public double devision(double a, double b) {
        return a / b;
    }


}
