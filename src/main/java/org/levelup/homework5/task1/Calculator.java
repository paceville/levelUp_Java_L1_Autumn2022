package org.levelup.homework5.task1;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    private int aInt, bInt;
    private double aDouble, bDouble;
    private long aLong, bLong;

    protected void setaInt(int aInt) {
        this.aInt = aInt;
    }

    protected int getaInt() {
        return this.aInt;
    }

    protected void setbInt(int bInt) {
        this.bInt = bInt;
    }

    protected int getbInt() {
        return this.bInt;
    }

    protected void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    protected double getaDouble() {
        return this.aDouble;
    }

    protected void setbDouble(double bDouble) {
        this.bDouble = bDouble;
    }

    protected double getbDouble() {
        return this.bDouble;
    }

    protected void setaLong(long aLong) {
        this.aLong = aLong;
    }
    protected long getaLong() {
        return this.getaLong();
    }

    protected void setbLong(long bLong) {
        this.bLong = bLong;
    }

    protected long getbLong() {
        return bLong;
    }

    protected int addition(int a, int b) {
        return a + b;
    }

    protected double addition(double a, double b) {
        return a + b;
    }

    protected long addition(long a, long b) {
        return a + b;
    }

    protected int substraction(int a, int b) {
        return a - b;
    }

    protected double substraction(double a, double b) {
        return a - b;
    }

    protected long substraction(long a, long b) {
        return a - b;
    }

    protected int multiplication(int a, int b) {
        return a * b;
    }

    protected double multiplication(double a, double b) {
        return a * b;
    }

    protected long multiplication(long a, long b) {
        return a * b;
    }

    protected int devision(int a, int b) {
        return a / b;
    }

    protected double devision(double a, double b) {
        return a / b;
    }

    protected long devision(long a, long b) {
        return a / b;
    }

    protected void start() {
        System.out.println("Calculator started...");
    }

    protected void close() {
        System.out.println("Calculator closed");
    }
}
