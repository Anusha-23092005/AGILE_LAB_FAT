package com.example;

public class Service {

    public double calculateValue(double a, double b, boolean condition) {

        double result;

        if (condition) {
            result = a * b;
        } else {
            result = a + b;
        }

        return result;
    }
}