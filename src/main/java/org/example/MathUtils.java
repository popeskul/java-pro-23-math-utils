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
}
