package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1: Реализовать программу, выводящую на экран результаты:
        //Сложения двух чисел
        //Вычитания двух чисел
        //Умножения двух чисел
        //Деления двух чисел
        //Каждая из арифметических операций должна быть реализована как отдельный метод.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        displayAddition(num1, num2);
        displaySubtraction(num1, num2);
        displayMultiplication(num1, num2);

        if (num2 != 0) {
            displayDivision(num1, num2);
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }

    public static void displayAddition(double a, double b) {
        double sum = a + b;
        System.out.println("Сложение: " + sum);
    }

    public static void displaySubtraction(double a, double b) {
        double difference = a - b;
        System.out.println("Вычитание: " + difference);
    }

    public static void displayMultiplication(double a, double b) {
        double product = a * b;
        System.out.println("Умножение: " + product);
    }

    public static void displayDivision(double a, double b) {
        double quotient = a / b;
        System.out.println("Деление: " + quotient);
    }
}






