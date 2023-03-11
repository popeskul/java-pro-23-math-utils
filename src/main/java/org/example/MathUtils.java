package org.example;

public class MathUtils {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double product(double a, double b) {
        return a * b;
    }

    public static double quotient(double a, double b) {
        return a / b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative input is not allowed.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("sum(1, 2) = " + sum(1, 2));
        System.out.println("difference(1, 2) = " + difference(1, 2));
        System.out.println("product(1, 2) = " + product(1, 2));
        System.out.println("quotient(1, 2) = " + quotient(1, 2));
        System.out.println("power(2, 3) = " + power(2, 3));
        System.out.println("factorial(5) = " + factorial(5));
    }
}
