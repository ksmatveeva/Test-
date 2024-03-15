package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int difference(int i, int i1) {
        return i;
    }

    public int product(int i, int i1) {
        return i;
    }

    public int sum(int i, int i1) {
        return i;
    }
}
