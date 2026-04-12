package com.example;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        double result = service.calculateValue(10, 5, true);

        System.out.println("Result: " + result);
    }
}