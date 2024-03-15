package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int sumResult = calculator.sum(5, 3);
        int differenceResult = calculator.difference(10, 4);
        int productResult = calculator.product(7, 6);
        double divisionResult = calculator.divide(20, 5);


        System.out.println("Сумма: " + sumResult);
        System.out.println("Разность: " + differenceResult);
        System.out.println("Произведение: " + productResult);
        System.out.println("Деление: " + divisionResult);
    }
}
